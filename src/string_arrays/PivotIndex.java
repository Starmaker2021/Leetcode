package string_arrays;

import java.util.Arrays;

public class PivotIndex {
    /*
     * @author :TAnshi
     * @time :2022/5/5 10:20
     * @description :leetcode数组寻找中心数
     */
    public static void main(String[] args) {
            int[] array = {0,3,2,-5};
        int a = pivotIndex(array);
        System.out.println(a);
    }

    public static int pivotIndex(int[] array) {
        // 第一次解题：
//第一步：计算数组的总和
//第二步：从arr[0]开始，从最左侧加到该数为数组总和的一半
//第三步：判断是否为奇数，奇数直接返回-1
//第四步：若为偶数，从arr[0]开始，求和，当和为sum的一半时，返回数组坐标，否则返回false
        //第一次解题错误，看错题目
//        int sum = 0;
//        int len = array.length;
//        int result = 0;
//        for (int i = 0; i < len; i++) {
//            sum += array[i];
//        }
//        if (sum % 2 != 0) {
//            return -1;
//        } else {
//            int currentSum = 0;
//            for (int i = 0; currentSum < sum / 2; i++) {
//                currentSum += array[i];
//                result = i;
//            }
//            if (currentSum == sum / 2) {
//                return result;
//            } else {
//                return -1;
//            }
//        }
        //第二次解题：
        //第一次解题：分三种情况遍历数组
        //1.判断arr[0]
        //2.当0<i<arr.len-1，从arr[0]加到arr[i-1] 是否 == (sum-arr[i])/2
        //3.当i=len-1
        int sum = Arrays.stream(array).sum();//数组之和
        int len = array.length;//数组长度
        for (int i = 0; i < len; i++) {
                    int currentSum = 0;
                    for (int j = 0; j < i; j++) {
                        currentSum += array[j];
                    }
                    if ((sum-array[i])%2==0 && currentSum == (sum - array[i]) / 2) {
                        return i;
                    }
        }
        return -1;
    }


        //参考答案
//            int total = Arrays.stream(array).sum();
//            int sum = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (2 * sum + array[i] == total) {
//                    return i;
//                }
//                sum += array[i];
//            }
//            return -1;
//        }

}

