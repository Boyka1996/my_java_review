package java_method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-15
 * Time: 下午3:44
 */
public class MainMethod {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.println("命令行入参args[" + i + "]为： " + args[i]);
        }
    }
}
