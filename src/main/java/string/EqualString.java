package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午10:18
 */
public class EqualString {
    public static void main(String[] args) {
        String str1 = new String("qqq");
        String str2 = "qqq";
        String str3 = "qqq";
        System.out.println(str3 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        str3 = "ppp";
        System.out.println(str3 == str2);

    }
}
