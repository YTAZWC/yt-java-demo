package top.ytazwc.annotations;

import java.util.List;

/**
 * @author 花木凋零成兰
 * @title PasswordUtils
 * @date 2024/5/27 18:01
 * @package top.ytazwc.annotations
 * @description TODO
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "密码必须至少包含一个数字")
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "新密码不能等于以前使用的密码")
    public boolean checkForNewPassword(List<String> prevPasswords, String passwd) {
        return !prevPasswords.contains(passwd);
    }

}
