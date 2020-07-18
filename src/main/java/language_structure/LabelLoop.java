package language_structure;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午4:22
 */
public class LabelLoop {
    public static void main(String[] args) {
        outer_loop:
        for (int i = 0; i < 3; ++i) {
            System.out.println("外层： " + i);
            for (int j = 0; j < 3; ++j) {
                if (i + j > 2) {
                    System.out.println("跳出！");
                    break outer_loop;

                }
                System.out.println(j);
            }
            System.out.println("外层" + i);
        }
    }
}
