package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-19
 * Time: 上午11:17
 */
public class InsertStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.insert(0,false);
        stringBuilder.append(true);
        stringBuilder.append("\n");
        stringBuilder.append('c');
        stringBuilder.append("\n");
        stringBuilder.append("a");
        stringBuilder.append("\n");
        stringBuilder.append(new StringBuilder("嗯哼？"));
        System.out.println(stringBuilder);
    }
}
