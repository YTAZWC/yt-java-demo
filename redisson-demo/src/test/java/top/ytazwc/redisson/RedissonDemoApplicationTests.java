package top.ytazwc.redisson;

import org.junit.jupiter.api.Test;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.redisson.entity.Student;

import java.util.concurrent.TimeUnit;

/**
 * <a href="https://cloud.tencent.com/developer/article/2223087">Redis实战之Redisson使用技巧详解，干活！</a>
 */
@SpringBootTest
class RedissonDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private RedissonClient redissonClient;

    @Test
    void testRedisson() {
        System.out.println(redissonClient);
    }

    @Test
    void testString() {
        // 字符串操作
        RBucket<String> rBucket = redissonClient.getBucket("strKey");
        // 设置 value 和 key 有效期
        rBucket.set("张三", 30, TimeUnit.SECONDS);
        // 通过key获取value
        Object strKey = redissonClient.getBucket("strKey").get();
        System.out.println(strKey);
    }

    @Test
    void testObject() {
        // 操作对象
        RBucket<Student> rBucket = redissonClient.getBucket("objKey");
        // 设置 value 和 key 的有效期
        rBucket.set(new Student(1L, "张三", 18), 30, TimeUnit.SECONDS);
        // 通过key获取value
        System.out.println(redissonClient.getBucket("objKey").get());
    }

    @Test
    void testMap() {
        // 操作哈希
        String mapKey = "mapKey";
        RMap<String, String> rMap = redissonClient.getMap(mapKey);
        // 设置map中的key-value
        rMap.put("id", "123");
        rMap.put("name", "赵四");
        rMap.put("age", "50");

        // 设置过期时间
        rMap.expire(30, TimeUnit.SECONDS);

        // 通过key获取value
        System.out.println(rMap.get("name"));
    }

    @Test
    void testList() {
        // 操作列表
        String listKey = "listKey";
        RList<Student> rList = redissonClient.getList(listKey);
        rList.add(new Student(1L, "张三", 18));
        rList.add(new Student(2L, "李四", 20));
        // 设置过期时间
        rList.expire(30, TimeUnit.SECONDS);
        System.out.println(redissonClient.getList(listKey));
    }

    @Test
    void testSet() {
        // 集合操作
        String setKey = "setKey";
        RSet<Student> rSet = redissonClient.getSet(setKey);
        rSet.add(new Student(1L, "张三", 18));
        rSet.add(new Student(2L, "李四", 20));
        rSet.expire(30, TimeUnit.SECONDS);
        System.out.println(redissonClient.getSet(setKey));
    }

    @Test
    void TestSortedSet() {
        // 操作有序集合
        // 操作的对象需要实现 Comparable 接口 并重写比较逻辑

        String sortedSetKey = "sortedSetKey";
        RSortedSet<Student> rSortedSet = redissonClient.getSortedSet(sortedSetKey);
        rSortedSet.add(new Student(1L, "张三", 18));
        rSortedSet.add(new Student(2L, "李四", 20));
        System.out.println(redissonClient.getSortedSet(sortedSetKey));

    }

    @Test
    void testBloomFilter() {
        // 操作布隆过滤器：用于检索一个元素是否在一个集合中，空间效率与查询时间均比较好，但是有一定地误识别率和删除困难
        RBloomFilter<String> rBloomFilter = redissonClient.getBloomFilter("seqId");
        // 初始化预期插入的数据量为 10000 和期望误差率为 0.01
        rBloomFilter.tryInit(10000, 0.01);
        // 插入部分数据
        rBloomFilter.add("100");
        rBloomFilter.add("200");
        rBloomFilter.add("300");
        // 设置过期时间
        rBloomFilter.expire(30, TimeUnit.SECONDS);
        // 判断是否存在
        System.out.println(rBloomFilter.contains("300"));
        System.out.println(rBloomFilter.contains("200"));
        System.out.println(rBloomFilter.contains("999"));
    }

    @Test
    void testId() {
        // 分布式自增Id
        // 随着数据量的增大，对数据进行分表、甚至分库，容易造成Id冲突；
        // 可以使用Redis来生成全局唯一的Id
        final String lockKey = "aaa";
        // 通过 redis 自增来获取序号
        RAtomicLong atomicLong = redissonClient.getAtomicLong(lockKey);
        // 设置过期时间
        atomicLong.expire(30, TimeUnit.SECONDS);
        // 获取值
        System.out.println(atomicLong.incrementAndGet());
    }

    @Test
    void testLock() {
        // 分布式锁
        final String lockKey = "abc";
        RLock rLock = redissonClient.getLock(lockKey);
        try {
            // 尝试 5 秒内获取锁 如果获取到了 最长60秒自动释放
            boolean res = rLock.tryLock(5L, 60L, TimeUnit.SECONDS);
            if (res) {
                // 成功获取到锁 进行业务处理
                System.out.println("获取锁成功");
            }
        } catch (Exception e) {
            System.out.println("获取锁失败,失败原因: " + e.getMessage());
        } finally {
            // 无论如果 进行解锁
            rLock.unlock();
        }
    }



}
