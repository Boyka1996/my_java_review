package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-19
 * Time: 上午11:32
 */
public class StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("啊？？？？？");
        System.out.println(stringBuilder.capacity());
        stringBuilder.insert(0, false);
        stringBuilder.append(true);
        stringBuilder.append("a");
        stringBuilder.append(new StringBuilder("嗯哼？"));
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
        System.out.println(stringBuilder.capacity());
    }
}
