import java.util.*;

class Solution {
    public static void main(String[] args) {
        //nn에서 mm만큼 돌면서 최댓값 갱신
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i <= n-m; i++) { 
                for (int j = 0; j <= n-m; j++) { 

                    int sum = 0;

                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            sum += arr[i+k][j+l];
                        }
                    }

                    if (maxValue < sum) {
                        maxValue = sum;
                    }
                }
            }

            System.out.println("#" + (tc+1) + " " + maxValue);
        }
    }
}