package hyunji;

import java.util.*;

public class thu_boj_2941_크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] croAlpha = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croAlpha.length; i++) {
            if (str.contains(croAlpha[i])) {
                str = str.replace(croAlpha[i], "0");
            }
        }

        System.out.println(str.length());
    }
}