package string;

/**
 * Created with IntelliJ IDEA.
 * Description: replace()方法不支持正则表达式，replaceAll(),replaceFirst()支持
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午5:36
 */
public class ReplaceString {
    public static void main(String[] args) {
        String str="a1a2b2";
        str=str.replace("a1","a2");
        System.out.println(str);
        str=str.replace("a","c");
        System.out.println(str);
    }
}
