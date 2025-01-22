import java.util.Scanner;

public class Swea_12712_파리퇴치3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int testCase = 1; testCase<=T; testCase++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] flyMap = new int[n][n];
			
			for(int i=0; i<flyMap.length; i++) {
				for(int j=0; j<flyMap[i].length; j++) {
					flyMap[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			int sumCross = 0;
			int sumX = 0;
			for(int i=0; i<flyMap.length; i++) {
				for(int j=0; j<flyMap[i].length; j++) {
					sumCross += flyMap[i][j];
					sumX += flyMap[i][j];
					int reps = m;
					while(--reps > 0) {
						// 십자 상->하->좌->우 순
						if(i-reps >=0) {
							sumCross += flyMap[i-reps][j];
						}
						if(i+reps <= n-1) {
							sumCross += flyMap[i+reps][j];
						}
						if(j-reps >=0) {
							sumCross += flyMap[i][j-reps];
						}
						if(j+reps <= n-1) {
							sumCross += flyMap[i][j+reps];
						}
						// X자 좌상->우하->좌하->우상 순
						if(i-reps >=0 && j-reps >= 0) {
							sumX += flyMap[i-reps][j-reps];
						}
						if(i+reps <= n-1 && j+reps <= n-1) {
							sumX += flyMap[i+reps][j+reps];
						}
						if(i+reps <= n-1 && j-reps >= 0) {
							sumX += flyMap[i+reps][j-reps];
						}
						if(i-reps >=0 && j+reps <= n-1) {
							sumX += flyMap[i-reps][j+reps];
						}
					}
					// 십자, X자 합 비교 -> 큰것과 max비교 후 max값 변경 및 sum = 0
					int tmp = sumCross > sumX? sumCross : sumX;
					max = max > tmp ? max : tmp;
					sumCross = 0;
					sumX = 0;
				}
			}
			System.out.println("#"+testCase+" "+max);
		}
	}
}
