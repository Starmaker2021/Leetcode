package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/21 8:54
 * @description :leetcode字符串匹配
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("ansssss", "ssbs"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        char start = needle.charAt(0);
        int henLen = haystack.length();
        int needLen = needle.length();
        Boolean e = false;
        for (int i = 0; i < henLen - needLen + 1; i++) {
            if (haystack.charAt(i) == start) {
                for (int j = 0; j < needLen; j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        e = true;
                    } else {
                        e = false;
                        break;
                    }
                }
                if (e) {
                    return i;
                }
            }
        }
        return -1;
    }
}
