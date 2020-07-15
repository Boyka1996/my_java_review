package java_method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-15
 * Time: 下午3:59
 */
public class VariableMethod {
    public static void test(int number, String... args) {
        for (String arg : args) {
            System.out.println("第" + number + "次调用： " + arg);

        }
    }

    public static void test1(String arg, String... args) {
        System.out.println(arg);
    }

    public static void test1(String... args) {
        for (String arg : args) {
            System.out.println(arg);

        }
    }

    public static void test(String arg, String... args) {
        System.out.println(arg + " " + args);


    }

    public static void main(String[] args) {
        test(1, "A");//在有方法重载时，优先调用
        test(2, "A", "B");
        //test1("1");会编译错误

    }

}
