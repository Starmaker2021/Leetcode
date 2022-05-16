package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/16 9:58
 * @description :leetcode最长公共前缀
 */
//思路分析：1.取出数组中最短字符串长度
//2.在小于字符串长度的情况下遍历数组，比较相同位置的字符，若相等，加入答案数组
//3.字符数组转字符串返回
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] question = {"ab", "a"};
        String answer = longestCommonPrefix(question);
        System.out.println(answer);
    }

    public static String longestCommonPrefix(String[] array) {
        int minLen = array[0].length();
        //取出最短字符长度
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minLen) {
                minLen = array[i].length();
            }
        }
        char[] answer = new char[minLen];
        int num = 0;
        boolean isContinue = true;
        if (array.length == 1) {
            return array[0];
        } else {
            for (int i = 0; i < minLen; i++) {
                char temp = array[0].charAt(i);
                for (int j = 0; j < array.length; j++) {
                    if (array[j].charAt(i) != temp) {
                        isContinue = false;
                        break;
                    }
                }
                if (isContinue) {
                    answer[i] = temp;
                    num++;
                } else {
                    break;
                }
            }
        }
        char[] answerArray = new char[num];
        for (int i = 0; i < num; i++) {
            answerArray[i] = answer[i];
        }
        String res = new String(answerArray);
        return res;
    }

}

