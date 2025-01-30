import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; //140
        }

        int over = sum - 100; //40 

        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) { //중복제거
                if (arr[i] + arr[j] == over) {
                    arr[i] = -1;
                    arr[j] = -1;
                    found = true; 
                    break; //찾으면 break하고 빠져나오기
                }
            }
            if (found) break;
        }

        Arrays.sort(arr);

        for (int i = 2; i < 9; i++) {
            System.out.println(arr[i]);
        }
    }
}
