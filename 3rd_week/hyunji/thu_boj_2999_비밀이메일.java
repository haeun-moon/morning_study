package hyunji;

import java.util.*;

public class thu_boj_2999_비밀이메일 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strToChar = str.toCharArray();
        int strLen = str.length();
        int r = 0, c = 0;
        for (int i = 1; i <= strLen; i++) {
            if (strLen % i == 0) {
                int divI = strLen / i;
                if (i >= divI) {
                    r = i;
                    c = divI;
                    break;
                }
            }
        }
        int idx = 0;
        char[][] newArr = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newArr[i][j] = strToChar[idx];
                idx++;
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(newArr[i][j]);
            }
        }
    }
}
