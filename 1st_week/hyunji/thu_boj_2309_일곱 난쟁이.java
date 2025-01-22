import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //숫자 7개 합이 100이 되는 경우 => 오름차순으로 정렬
        //100을 넘게하는 나머지 두 값 찾아서 제외하고 - 나머지는 정렬
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; //배열총합 140
        }

        int over = sum - 100; //넘치는 값 40

        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) { //중복제거
                if (arr[i] + arr[j] == over) { //두 값 찾으면 -1 넣어주고 break;
                    arr[i] = -1;
                    arr[j] = -1;
                    found = true;
                    break;
                }
            }
            if (found) break; //바깥 for문도 break;
        }

        Arrays.sort(arr);

        for (int i = 2; i < 9; i++) { //-1, -1 다음부터 출력
            System.out.println(arr[i]);
        }
    }
}
