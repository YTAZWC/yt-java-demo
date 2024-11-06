package top.ytazwc.redisson.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 花木凋零成兰
 * @title RedisConfig
 * @date 2024-11-06 14:47
 * @package top.ytazwc.redisson.config
 * @description redisson 配置
 */
@Configuration
public class RedissonConfig {

    @Bean(destroyMethod = "shutdown")   // 服务停止后 销毁
    public RedissonClient redissonClient() {
        // 1. 创建配置
        Config config = new Config();
        // 单点模式
        config.useSingleServer()
              .setAddress("redis://8.134.32.45:6379")
              .setPassword("huamulan0158")
              .setDatabase(3);

        return Redisson.create(config);
    }

}
