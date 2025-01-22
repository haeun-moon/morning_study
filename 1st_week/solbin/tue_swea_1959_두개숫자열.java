package morning_study.solbin;
import java.util.*;

public class D2_1959_두개숫자열 {
	final static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int T = sc.nextInt();
		for (int t= 1; t<= T; t++) {
			System.out.println("#" + t + " " + run());
		}
	}
	public static String run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n<m) {
			int tmp=n;
			n=m;
			m=tmp;
		}
		int a[] = new int[n];
		int b[] = new int[m];
		int max = 0;
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		for (int i=0;i<=n-m;i++) {
			int sum = 0;
			for (int j=0;j<m;j++) {
				sum += a[j+i] * b[j]; 
			}
			if (sum > max) max = sum;
		}
		return String.valueOf(max);
	}
}