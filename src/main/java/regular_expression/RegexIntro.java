package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-20
 * Time: 上午10:34
 */
public class RegexIntro {
    public static void main(String[] args) {
        String str = "eating apple seeing paper watching movie";
        String regex = "(\\w{2,5}ing\\s)";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        int groupCount = matcher.groupCount();
        System.out.println(groupCount);
        System.out.println(matcher.find());
        System.out.println(matcher.group());
        if (matcher.find()) {
            for (int i = 0; i < groupCount; ++i) {
                System.out.println(matcher.group(i));
            }
        } else {
            System.out.println("Not found!");
        }
//        System.out.println();
    }
}
