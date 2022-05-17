package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/17 6:54
 * @description :leetcode最长回文串
 */
//解题思路:封装一个判断回文串方法
//遍历数组，从最大的长度开始遍历，符合条件即返回
public class LongestPalindrome {
    public static void main(String[] args) {
        String question = "\n" +
                "asdadsaccasdzx";
        System.out.println(longestPalindrome(question));
    }

    public static String longestPalindrome(String string) {
        int stringLength = string.length();
        for (int len = stringLength; len > 0; len--) {
            for (int i = 0; i + len <= stringLength; i++) {
                if (isPalindrome(string, i, i + len)) {
                    return string.substring(i, i + len);
                }
            }
        }
        return "";
    }

    public static Boolean isPalindrome(String string, int start, int end) {
        while (start < end) {
            if (string.charAt(start) != string.charAt(end-1)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
