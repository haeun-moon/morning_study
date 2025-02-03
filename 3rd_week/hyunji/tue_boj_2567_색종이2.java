package hyunji;

import java.util.*;

public class tue_boj_2567_색종이2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[110][110];
        
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int ny = j + dy[k];
                        int nx = i + dx[k];

                        if (ny < 0 || ny > 99 || nx < 0 || nx > 99 || paper[nx][ny] == 0) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}