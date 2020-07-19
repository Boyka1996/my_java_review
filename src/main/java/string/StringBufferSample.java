package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-19
 * Time: 下午12:14
 */
public class StringBufferSample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("test-test-test");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());

        stringBuffer.replace(0, 4, "a");
        System.out.println(stringBuffer);
        stringBuffer.insert(6,"我要去头条！！！");
        System.out.println(stringBuffer);
    }
}
