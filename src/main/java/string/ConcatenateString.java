package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午5:19
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "1";
        System.out.println(str);
        str = str.concat("2");
        System.out.println(str);
        str.concat("3");
        System.out.println(str);
    }
}
