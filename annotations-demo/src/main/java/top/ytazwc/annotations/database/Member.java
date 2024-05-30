package top.ytazwc.annotations.database;

//import lombok.Getter;
//import lombok.ToString;

/**
 * @author 花木凋零成兰
 * @title Member
 * @date 2024/5/27 23:08
 * @package top.ytazwc.annotations.database
 * @description 使用自定义数据库注解示例
 */
//@Getter
//@ToString
@DBTable(name = "MEMBER")
public class Member {

    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String reference;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getReference() {
        return reference;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", reference='" + reference + '\'' +
                '}';
    }
}
