package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/13 8:25
 * @description :leetcode旋转矩阵问题
 */
//给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
//不占用额外内存空间能否做到？
//实现思路：首先根据左上右下对角线进行轴对称，然后根据每一行中点进行轴对称
public class Rotate {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {6, 2, 2},
                {8, 5, 6}};
        printArray(rotate(array));
    }


    public static int[][] rotate(int[][] array) {
        //取出正方形矩阵的长度
        int len = array.length;
        //首先进行轴对称
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        //接着进行轴对称
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][len - 1 - j];
                array[i][len - 1 - j] = temp;
            }
        }
        return array;
    }

    //打印数组的方法
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
