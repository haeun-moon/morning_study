package hyunji;

import java.util.Scanner;

public class tue_boj_2798_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum += (arr[i] + arr[j] + arr[k]);
                    if (sum <= m) {
                        if (maxValue < sum) {
                            maxValue = sum;
                        }
                    }
                    sum = 0;
                }
            }
        }

        System.out.println(maxValue);
    }
}
