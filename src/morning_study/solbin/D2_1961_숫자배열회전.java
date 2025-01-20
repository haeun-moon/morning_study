package morning_study.solbin;

import java.util.Scanner;

public class D2_1961_숫자배열회전 {
	final static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int T = sc.nextInt();
		for (int t= 1; t<= T; t++) {
			System.out.println("#" + t);
			run();
		}
	}
	
	public static void run() {
		int n = sc.nextInt();
		int[][] mat0 = new int[n][n];
		int[][] mat1 = new int[n][n];
		int[][] mat2 = new int[n][n];
		int[][] mat3 = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				mat0[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				mat1[i][j] = mat0[n-j-1][i];
				mat2[i][j] = mat0[n-i-1][n-j-1];
				mat3[i][j] = mat0[j][n-i-1];
			}
		}
		for (int i=0;i<n;i++) {
			String str1 = "", str2 = "", str3 = "";
			for (int j=0;j<n;j++) {
				str1 += mat1[i][j];
				str2 += mat2[i][j];
				str3 += mat3[i][j];
			}
			System.out.println(str1 + " " + str2 + " " + str3);
		} 
	}
}