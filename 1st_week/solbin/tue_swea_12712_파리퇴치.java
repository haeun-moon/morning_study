package morning_study.solbin;

import java.util.*;

public class D2_12712_파리퇴치 {
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
		int max = 0;
		int[][] fly = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				fly[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				int sum1 = 0;
				for (int k=-m+1;k<m;k++) {
					if (i+k>=0&&i+k<n) sum1+=fly[i+k][j];
				}
				for (int k=-m+1;k<m;k++) {
					if (j+k>=0&&j+k<n&&k!=0) sum1+=fly[i][j+k];
				}
				if (sum1>max) max=sum1;
				int sum2 = 0;
				for (int k=-m+1;k<m;k++) {
					if (i+k>=0&&i+k<n&&j+k>=0&&j+k<n) sum2+=fly[i+k][j+k];
				}
				for (int k=-m+1;k<m;k++) {
					if (i+k>=0&&i+k<n&&j-k>=0&&j-k<n&&k!=0) sum2+=fly[i+k][j-k];
				}
				if (sum2>max) max=sum2;
			};
		};
		return String.valueOf(max);
	}
}