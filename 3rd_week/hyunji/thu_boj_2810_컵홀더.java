package hyunji;

import java.util.*;

public class thu_boj_2810_컵홀더 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next(); //SLLS

        String replaceStr = str.replace("LL", "L"); //SLS
        String[] replaceStrToStrArr = replaceStr.split(""); //[S,L,S]
        replaceStr = "*" + String.join("*", replaceStrToStrArr) + "*"; //*S*L*S*

        int cnt = 0;
        for (int i = 0; i < replaceStr.length(); i++) {
            if (replaceStr.charAt(i) == '*') cnt++;
        }

        int result = Math.min(n, cnt);

        System.out.println(result);
    }
}

