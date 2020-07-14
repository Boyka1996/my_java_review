package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description: float类型是单精度数值类型，占用内存32位，4字节
 *              小数后必须加f或者F，否则会被认为是double类型
 *              浮点数精度有限，计算机中有舍入误差
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午8:40
 */
public class FloatIntro {
    public static void main(String[] args) {
        float positive_number = 3.4028235E38F;
        float negative_number = -1.4E-45f;
        System.out.println("float类型变量positive_number为：" + positive_number);
        System.out.println("float类型变量negative_number为：" + negative_number);
    }
}
