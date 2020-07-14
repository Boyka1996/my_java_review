package basic_data_type;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午10:25
 */
public class AutoConvert {

    public static void main(String[] args) {
        byte byteNumber = 8;
        int intNumber = byteNumber;
        int intNumber1 = 12345;
        long longNumber = intNumber1;
        float floatNumber = longNumber;
        double doubleNumber = floatNumber;
        System.out.println("byte转int：" + intNumber);
        System.out.println("int转long：" + longNumber);
        System.out.println("long转float：" + floatNumber);
        System.out.println("int转double：" + doubleNumber);
    }

}
