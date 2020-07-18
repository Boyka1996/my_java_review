package string;

/**
 * Created with IntelliJ IDEA.
 * Description: String不是基本数据类型，不能用(String)强制类型转换
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午4:58
 */
public class ConstructString {
    public static void main(String[] args) {
        String str = new String();
        str = new String("1");
        str = String.valueOf(1);
        int a = 1;
        str = Integer.toString(a);
//        str = String.valueOf(Boolean.TRUE);
//        str = String.valueOf(null);//报错
        char[] charArray = {'1', '2', '3', '4', '5'};
        str = new String(charArray, 2, 3);
        str = String.valueOf(charArray);
        str = String.valueOf(charArray,2,2);
        System.out.println(str);
    }
}
