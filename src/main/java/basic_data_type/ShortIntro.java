package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description: short数据类型占内存16位，2字节，有符号
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-13
 * Time: 下午4:52
 */
public class ShortIntro {
    public static void main(String[] args) {
        short negative_number = -32768;
        //short x = 12345 + 54321; 会溢出报错
        short positive_number = 32767;
        System.out.println("short类型变量positive_number为：" + positive_number);
        System.out.println("short类型变量negative_number为：" + negative_number);
    }
}
