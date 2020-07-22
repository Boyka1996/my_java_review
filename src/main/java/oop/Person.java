package oop;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-22
 * Time: 下午4:51
 */
public class Person {
    public static String name = "小王";

    private void changeName() {
        name = "老王";
    }

    public static void main(String[] args) {
        System.out.println(name);
        Person person = new Person();
        person.changeName();
        System.out.println(name);
    }
}
