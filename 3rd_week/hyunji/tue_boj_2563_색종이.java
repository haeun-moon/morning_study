package hyunji;

import java.util.*;

public class tue_boj_2563_색종이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] paper = new int[110][110];
        
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }
}