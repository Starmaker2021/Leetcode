package string_arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int a = binarySearch(array1, 3);
        System.out.println(a);
    }

    //二分查找实现思路：通过比较范围的不断缩小，当左边界和右边界相等时则为目标索引。
    public static int binarySearch(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] < num) {
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        return left;
    }
}
