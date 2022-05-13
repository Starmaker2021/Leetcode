package string_arrays;
/*
 * @author :TAnshi
 * @time :2022/5/11 10:17
 * @description :leetcode插入搜索位置
 */
//题目要求：给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。请必须使用时间复杂度为 O(log n) 的算法。

public class SearchInsert {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8};
        System.out.println(searchInsert(array, 9));
    }

    public static int searchInsert(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        if (num > array[array.length - 1]) {
            return array.length;
        } else if (num < array[0]) {
            return 0;
        } else {
            while (left < right) {
                int mid = (left + right) / 2;
                if (array[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}
