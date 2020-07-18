package language_structure;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午12:08
 */
public class SwitchSample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int  number=scanner.nextInt();
       switch (number){
           case 1:
               System.out.println(number);
               break;//如果没有break，还会向下执行default
           default:
               System.out.println("Ohhhh!");
       }



    }
}
