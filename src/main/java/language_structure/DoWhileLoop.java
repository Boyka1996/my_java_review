package language_structure;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午4:15
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 4);
        do {
            System.out.println("这里也执行了！");
            i++;
        } while (i < 4);
    }
}
