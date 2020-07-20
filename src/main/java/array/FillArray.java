package array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-19
 * Time: 下午4:13
 */
public class FillArray {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 1;
        Arrays.fill(intArray, 10);
        Arrays.fill(intArray, 1,3,10);
        System.out.println(Arrays.toString(intArray));
    }
}
