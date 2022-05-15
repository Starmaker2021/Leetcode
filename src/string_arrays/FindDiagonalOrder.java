package string_arrays;

/*
 * @author :TAnshi
 * @time :2022/5/15 8:44
 * @description :leetcode对角线遍历
 */
//解题思路：一共遍历M+N次，偶数次向上遍历，奇数次向下遍历
//向上遍历是m++，n--。
//考虑两种边界情况：一种是没到右边界，这种情况下m++；第二种为到了右边界，这种情况下m+2，n--。
public class FindDiagonalOrder {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {2, 1}, {3, 6}};
        findDiagonalOrder(array);

    }

    public static int[] findDiagonalOrder(int[][] array) {
        int M = array.length;
        int N = array[0].length;
        int count = M + N - 1;
        int[] answer = new int[M * N];
        int answerIndex = 0;
        int m = 0;
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                while (m >= 0 && n < N) {
                    answer[answerIndex] = array[m][n];
                    m--;
                    n++;
                    answerIndex++;
                }
                if (n < N) {
                    m++;
                } else {
                    m = m + 2;
                    n--;
                }
            } else {
                while (n >= 0 && m < M) {
                    answer[answerIndex] = array[m][n];
                    m++;
                    n--;
                    answerIndex++;
                }
                if (m < M) {
                    n++;
                } else {
                    n = n + 2;
                    m--;
                }

            }
        }

        return answer;
    }

}

