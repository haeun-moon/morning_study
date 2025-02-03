package hyunji;

import java.util.Scanner;

public class thu_boj_2851_슈퍼마리오 {
    public static void main(String[] args) {
        //100-누적합 크기비교
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int res = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i]; //항상 sum이 먼저 계산됨

            if (Math.abs(100-sum) <= Math.abs(100-res)) {
                res = sum;

                if (sum >= 100) { //그래서 sum이 100 이상이거나 초과시 종료
                    break;
                }
            }
        }

        System.out.println(res);
    }
}