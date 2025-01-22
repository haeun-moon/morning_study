import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3장의 합이 m보다 작거나 같고, m에 가장 가까운 합 구하기 => 완전탐색
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
                    if (sum <= m) { //합이 조건 안에 들어오면 최댓값 갱신
                        if (maxValue < sum) {
                            maxValue = sum;
                        }
                    }
                    sum = 0; //확인 후 합은 초기화 시켜주기
                }
            }
        }

        System.out.println(maxValue);
    }
}
