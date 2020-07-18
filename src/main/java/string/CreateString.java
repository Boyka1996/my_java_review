package string;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * Description: Java中String对象被创建后是不可以被更改的，虽然可以第String对象进行赋值操作，实际上是创建了一个新的字符串对象
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午4:34
 */
public class CreateString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String str=new String();等价于String str="";
//        String str; 必须初始化，要不会编译失败
        String str = null;
        System.out.println(str);


        String str1 = "hello";
        // 打印str1的内存地址
        System.out.println("str1的内存地址：" + System.identityHashCode(str1));
        String str2 = "world";
        str1 += str2;
        // str1的内存地址已经改变了
        // str1+=str2实际上是执行了str1=(new StringBuilder()).append(str2).toString();
        // 前后实际额外产生了一个StringBuilder与一个helloworld的字符串常量。
        System.out.println("执行+=后str1的内存地址：" + System.identityHashCode(str1));
        System.out.println("拼接之后str1的值：" + str1);

        String str3 = "123";
        // 创建一个新的对象来保存拼接之后的值
        String str4 = str3.concat("456");//str4原来为空，所以直接在这上面了不用创建新的对象
        // concat操作不会改变原来str3的值
        System.out.println("str3的值：" + str3);
        System.out.println("str4的值：" + str4);

        String str5 = "ABC";
        // replace操作不会改变原来str6的值
        String str6 = str5.replace("A", "B");
        System.out.println("str5的值：" + str5);
        System.out.println("str6的值：" + str6);

        str = "Hello World";
        System.out.println("修改前的str:" + str);
        System.out.println("修改前的str的内存地址" + System.identityHashCode(str));
        // 获取String类中的value字段
        Field valueField = String.class.getDeclaredField("value");
        // 改变value属性的访问权限
        valueField.setAccessible(true);
        // 获取str对象上value属性的值
        char[] value = (char[]) valueField.get(str);
        // 改变value所引用的数组中的字符
        value[3] = '?';
        System.out.println("修改后的str:" + str);
        System.out.println("修改前的str的内存地址" + System.identityHashCode(str));
    }
}
