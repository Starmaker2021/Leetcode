package string_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/*
 * @author :TAnshi
 * @time :2022/5/18 6:20
 * @description :leetcode翻转//failed
 */
//解题思路：首先将字符串转化成字符数组。
//然后利用双指针取出单词和空格存入字符串数组
//翻转字符串数组
public class ReverseWords {
    public static void main(String[] args) {
        String string1 = "hjj  d   d d sss d d dd   kk";
        System.out.println(reverseWords(string1));
    }

//    public static String reverseWords(String s) {
//        // 除去开头和末尾的空白字符
//        s = s.trim();
//        // 正则匹配连续的空白字符作为分隔符分割
//        List<String> wordList = Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordList);
//        return String.join(" ", wordList);
//    }

    public static String reverseWords(String s) {
        //去除头尾空格
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        String sub1 = s.substring(start, end + 1);
        String[] sub1String = sub1.split(" ");
        List <String>sub1List = new ArrayList(asList(sub1String));
        //去中间多余空格
        for (int i = 0; i < sub1List.size(); i++) {
            String a = sub1List.get(i);
            if(a.equals("")){
                sub1List.remove(i);
            }
        }
        String a = sub1List.toString();
        return a;
    }
}
