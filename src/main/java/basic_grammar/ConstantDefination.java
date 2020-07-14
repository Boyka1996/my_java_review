package basic_grammar;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-14
 * Time: 上午10:41
 */
public class ConstantDefination {
    private static final int DAY_SECOND = 24 * 60 * 60;

    private static void printConstant() {
        System.out.println("全局变量DAY_SECOND：" + DAY_SECOND);
    }

    public static void main(String[] args) {
        final char DAY_SECOND = 'x';
        System.out.println("局部变量DAY_SECOND：" + DAY_SECOND);
        printConstant();
    }
}
