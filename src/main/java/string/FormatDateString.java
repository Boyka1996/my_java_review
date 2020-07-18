package string;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午10:28
 */
public class FormatDateString {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(String.format("%tY年%tm月%td日",date,date,date));
        System.out.println(String.format("%tH时%tM分%tS秒",date,date,date));
    }
}
