package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-20
 * Time: 下午4:06
 */
public class PatternExample {
    public static void main(String[] args) {
        String str = "今日头条www.01baidu.com";
        String regex = "[a-z](.*)(\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int groupCount = matcher.groupCount();
        System.out.println(groupCount);
        if (matcher.find()) {
            for (int i = 0; i < groupCount; ++i) {
                System.out.println(matcher.group(i));
            }
        } else {
            System.out.println("Not found!");
        }

        str = "<This><is><an><example>";
        regex = "<.+>";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());

        } else {
            System.out.println("Not found!");
        }


        str = "eating apple seeing paper watching movie";
        regex = "(\b\\w+?)ing";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());

        } else {
            System.out.println("Not found!");
        }
        regex = "(\b\\w+?)(?=ing)";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());

        } else {
            System.out.println("Not found!");
        }

        str = "unite one unethical ethics use untie ultimate";
        regex = "\b(?!un)\\w+\b";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());

        } else {
            System.out.println("Not found!");
        }
        regex = "(?<![a-z])\\d{3,}";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());

        } else {
            System.out.println("Not found!");
        }

    }
}
