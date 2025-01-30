import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 스위치 개수
        int[] switches = new int[N + 1];  // 인덱스 1부터 사용
        
        for (int i = 1; i <= N; i++) {
            switches[i] = sc.nextInt();  // 스위치 상태 입력
        }
        
        int M = sc.nextInt();  // 학생 수
        for (int i = 0; i < M; i++) {
            int gender = sc.nextInt();  // 성별
            int num = sc.nextInt();     // 받은 숫자
            
            if (gender == 1) {
                // 남학생: 배수 위치 스위치 반전
                for (int j = num; j <= N; j += num) {
                    switches[j] = 1 - switches[j];
                }
            } else {
                // 여학생: 중심(num) 반전
                switches[num] = 1 - switches[num];

                // k 값을 증가시키며 대칭 확인
                for (int k = 1; num - k >= 1 && num + k <= N; k++) {
                    if (switches[num - k] == switches[num + k]) {
                        switches[num - k] = 1 - switches[num - k];
                        switches[num + k] = 1 - switches[num + k];
                    } else {
                        break;  // 대칭이 깨지면 종료
                    }
                }
            }
        }
        
        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(switches[i] + " ");
        }
    }
}
