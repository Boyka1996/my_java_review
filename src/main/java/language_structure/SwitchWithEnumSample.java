package language_structure;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午12:51
 */

public class SwitchWithEnumSample {


    public static void main(String[] args) {
        String name = "二狗";
        switch (Objects.requireNonNull(PersonEnum.getPersonName(name))) {
            case ER_GOU:
                System.out.println(PersonEnum.ER_GOU.getName());
                break;
            case XIAO_WANG:
                System.out.println(PersonEnum.XIAO_WANG.getName());
                break;
            default:
                System.out.println("查无此人");
        }

    }
}
