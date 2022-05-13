package string_arrays;
/*
 * @author :TAnshi
 * @time :2022/5/12 7:16
 * @description :leetcode数组合并
 */

//以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[][] question = {{1, 2}, {6, 9}, {7, 10}, {3, 7}, {2, 4}};
        merge(question);
    }

    public static int[][] merge(int[][] intervals) {
        //根据第一个字符进行排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }


}