package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description: 默认十进制，数字前面加0表示八进制，加0x表示十六进制，加0b表示二进制
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午8:43
 */
public class NumberIntro {
    public static void main(String[] args) {
        int a = 0b0000_0011;
        int b = 1010;
        int c = 01234;
        int d = 0xF1E3;//0xf1e3
        System.out.println("二进制输出：" + a + ' ' + Integer.toBinaryString(a));
        System.out.println("十进制输出：" + b);
        System.out.println("八进制输出：" + c + ' ' + Integer.toOctalString(c));
        System.out.println("十六进制输出：" + d + ' ' + Integer.toHexString(d));
    }
}
