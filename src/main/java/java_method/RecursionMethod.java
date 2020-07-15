package java_method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-15
 * Time: 下午4:15
 */
public class RecursionMethod {
    private static void test() {
        System.out.println("方法正在调用");
        test();
    }

    private static void jim() {
        System.out.println("Hello jack!");
        jack();
    }

    private static void jack() {
        System.out.println("Hello jim");
        jim();
    }

    public static void main(String[] args) {
        jim();
    }
}
