import java.util.*;

class Solution {
    public static void main(String[] args) {
        //슬라이딩 윈도 - 브루트포스 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int[] brr = new int[m];
            for (int k = 0; k < m; k++) {
                brr[k] = sc.nextInt();
            }
            
            int maxValue = Integer.MIN_VALUE;
            if (n < m) { 
                for (int a = 0; a <= m-n; a++) { 
                    int tmp = 0;
                    for (int b = 0; b < n; b++) { 
                        tmp += brr[a+b] * arr[b]; 
                    }
                    maxValue = Math.max(maxValue, tmp);
                }
            }
            else { //n > m (== 어디에붙든 상관X)
                for (int a = 0; a <= n-m; a++) {
                    int tmp = 0; 
                    for (int b = 0; b < m; b++) {
                        tmp += arr[a+b] * brr[b];
                    }
                    maxValue = Math.max(maxValue, tmp);
                }
            }

            System.out.println("#" + (i+1) + " " + maxValue);
        }
    }
}