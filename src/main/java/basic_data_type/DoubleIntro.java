package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description: 64位，8字节，小数后加D或者d也可以不加，同样不可以表示精确的值
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午9:09
 */
public class DoubleIntro {
    public static void main(String[] args) {
        double positive_number = 1.7976931348623157E308;
        double negative_number = -4.9E-324;
        System.out.println("double类型变量positive_number为：" + positive_number);
        System.out.println("double类型变量negative_number为：" + negative_number);
    }
}
