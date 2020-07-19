package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-19
 * Time: 上午11:30
 */
public class DeleteStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, false);
        stringBuilder.append(true);
        stringBuilder.append('c');
        stringBuilder.append("a");
        stringBuilder.append(new StringBuilder("嗯哼？"));
        stringBuilder.delete(0, 4);
        System.out.println(stringBuilder);
        stringBuilder.delete(2, 2);
        System.out.println(stringBuilder);//首尾相同，不会删除
    }
}
