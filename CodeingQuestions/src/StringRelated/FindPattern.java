package StringRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aneesh Mathai
 */
public class FindPattern {
    public static void main(String[] args) {
        List<Integer> testList=findPattern("BACDGABCDA", "ABCD");
//        List<Integer> testList=findPattern("AAABABAA", "AABA");
        testList.forEach(System.out::println);
    }

    public static List<Integer> findPattern(String input, String pattern) {
        List<Integer> result = new ArrayList<>();
        String patternSorted = sortString(pattern);
        for(int i=0;i<=input.length()-pattern.length();i++) {
            String subString = input.substring(i, i + pattern.length());
            if(sortString(subString).equals(patternSorted)) {
                result.add(i);
            }
        }
        return result;
    }

    public static String sortString(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
