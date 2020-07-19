package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午11:08
 */
public class CreateStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(32);
        StringBuilder stringBuilder3 = new StringBuilder("123");
        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3);

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder4);
    }
}
