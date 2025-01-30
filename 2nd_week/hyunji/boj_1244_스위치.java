import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1: 남자 - 입력값의 배수면 스위치 바꾸기
        //2: 여자 - 안쪽에서부터 대칭이면 스위치 바꾸고 다음 대칭 확인 - 아니면 break

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i+1] = sc.nextInt();
        }

        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int gen = sc.nextInt();
            int num = sc.nextInt();

            if (gen == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % num == 0) {
                        if (arr[j] == 1) arr[j] = 0; //스위치 - 1이면 0, 0이면 1
                        else arr[j] = 1;
                    }
                }
            }
            else { //gen == 2
                //제자리부터 스위치
                if (arr[num] == 0) arr[num] = 1;
                else arr[num] = 0;

                for (int k = 1; k < n/2; k++) {
                    //양쪽 범위 벗어나면 종료
                    if (num-k == 0 || num+k > n) break;

                    //대칭
                    if (arr[num-k] == arr[num+k]) {
                        if (arr[num-k] == 1) {
                            arr[num-k] = 0;
                            arr[num+k] = 0;
                        }
                        else {
                            arr[num-k] = 1;
                            arr[num+k] = 1;
                        }
                    }
                    else break;
                }
            }
        }

        //20개씩 출력
        int arrLength = arr.length;
        if (arrLength < 20) {
            for (int l = 1; l <= n; l++) {
                System.out.print(arr[l] + " ");
            }
        }
        else {
            int numLinesWith20 = n / 20;

            for (int l = 0; l < numLinesWith20; l++) {
                for (int a = 0; a < 20; a++) {
                    System.out.print(arr[a + 20 * l + 1] + " "); //인덱스 갱신
                }
                System.out.println();
            }
            
            int remainder = n % 20; //20개씩 자르고 남은 원소

            if (remainder > 0) {
                for (int a = 0; a < remainder; a++) {
                    System.out.print(arr[a + 20 * numLinesWith20 + 1] + " ");
                }
            }
        }
    }
}