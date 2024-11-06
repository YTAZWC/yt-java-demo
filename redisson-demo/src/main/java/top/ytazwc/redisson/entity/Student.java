package top.ytazwc.redisson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 花木凋零成兰
 * @title Student
 * @date 2024-11-06 21:44
 * @package top.ytazwc.redisson.entity
 * @description 学生实体
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable, Comparable<Student> {
    private Long id;
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student obj) {
        return this.getId().compareTo(obj.getId());
    }
}
