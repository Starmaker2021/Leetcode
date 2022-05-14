package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/14 15:51
 * @description :leetcode零矩阵问题
 */
//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
//解题思路：找到值为零的位置，记录在一个数列中。再循环数列，完成赋值操作。
public class SetZeroes {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 0}, {7, 0, 3}, {1, 2, 3}};
        printArray(setZeroes(array));
    }

    public static int[][] setZeroes(int[][] array) {
        int row = array.length;
        int column = array[0].length;
        int[][] zeroIdx = new int[row * column][2];
        int zeroNum = 0;
        //遍历数组，记录0值位置
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == 0) {
                    zeroIdx[zeroNum][0] = i;
                    zeroIdx[zeroNum][1] = j;
                    zeroNum++;
                }
            }
        }
        //遍历记录数组，重新设置原数组
        for (int i = 0; i < zeroNum; i++) {
            int zeroRow = zeroIdx[i][0];
            int zeroColumn = zeroIdx[i][1];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    array[zeroRow][k] = 0;
                    array[j][zeroColumn] = 0;
                }
            }
        }
        return array;
    }

    //数组打印方法
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
