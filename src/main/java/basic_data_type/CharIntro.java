package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description: 16位，2字节，''用来表示一个字符，最小值为\\u000(即0)，最大值为\\ufff(即65535)
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午9:13
 */
public class CharIntro {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '零';
        char ch3 = '1';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println((int)ch2);
        char ch4='\\';
        char ch5='\t';
        char ch6='\u2501';
        char ch7='\'';
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);
        System.out.println(ch7);

    }

}
