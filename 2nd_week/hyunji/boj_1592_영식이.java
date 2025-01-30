import java.util.*;

public class Main {
    public static void main(String[] args) {
        //n개, 원소가 m이면 종료, 홀짝에 따라 l만큼 이동
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        int[] arr = new int[n+1];
        arr[1] = 1;
 
        int cnt = 0;
        int i = 1;
        while (true) {
            
            if (arr[i] == m) {
                System.out.println(cnt);
                return;
            }

            if (arr[i] % 2 != 0) { //홀수 => 시계방향 L번째
                i = i + l;

                if (i > n) { //범위 넘어갈때 설정
                    i = i - n;
                }
            }
            else { //짝수 => 반대
                i = i - l;

                if (i < 1) {
                    i = i + n;
                }
            }

            arr[i] += 1;
            cnt += 1;
        }
    }
}