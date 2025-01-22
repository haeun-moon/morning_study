import java.util.*;

public class Main {
    public static void main(String[] args) {
        //주어지는 분해합의 가장 작은 생성자 구하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //216 분해합
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int sum = i; //198
            String strn = String.valueOf(i); //"198"
            for (int j = 0; j < strn.length(); j++) { //strn.length() == 3
                char ch = strn.charAt(j);
                int ch2int = Character.getNumericValue(ch); //자릿수 돌면서 char로 뽑고 int로 형변환
                sum += ch2int; //198 + 1 + 9 + 8
            }
            if (sum == n) { //분해합 찾으면
                found = true; //found true로 바꾸고 break로 빠져나오기
                System.out.println(i);
                break;
            }
        }

        if (!found) System.out.println(0);
    }
}