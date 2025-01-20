package morning_study.solbin;
import java.util.*;
 
public class D4_1486_선반 {
	final static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int T = sc.nextInt();
        for (int t= 1; t<= T; t++) {
            System.out.println("#" + t + " " + run());
        }
    }
     
    private static String run() {
        int n = sc.nextInt(); // 점원수
        int b = sc.nextInt(); // 최소높이
        int max=0;
        int[] h = new int[n];
        for (int i=0;i<n;i++) {
            h[i] = sc.nextInt();
            max+=h[i];
        }
        for (int i=0;i<(1<<n);i++) {//n비트
        	int sum = 0;
        	for (int j=0;j<n;j++) {//j번째자리
        		if ((i&(1<<j))!=0) {
            		sum+=h[j];
        		}
        	}
        	if (sum<max&&b<=sum) {
        		max = sum;
        	}
        }
        max-=b;
        String ret = String.valueOf(max);
        return ret;
    }
}