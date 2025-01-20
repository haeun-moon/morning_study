import java.util.*;

class Solution {
    public static void main(String[] args) {
        //90, 180, 270도 회전하는 함수 호출
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            
            int[][] narr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    narr[i][j] = sc.nextInt();
                }
            }

            int[][] rotated90 = rotate90(narr);
            int[][] rotated180 = rotate180(narr);
            int[][] rotated270 = rotate270(narr);

            //출력
            System.out.println("#" + (tc+1));
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(rotated90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(rotated180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < n; j++) {
                    System.out.print(rotated270[i][j]);
                }

                System.out.println();
            }

            
        }
    }

    public static int[][] rotate90(int[][] matrix) {
        int n = matrix.length; 
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static int[][] rotate180(int[][] matrix) {
        return rotate90(rotate90(matrix));
    }

    public static int[][] rotate270(int[][] matrix) {
        return rotate90(rotate90(rotate90(matrix)));
    }
}
