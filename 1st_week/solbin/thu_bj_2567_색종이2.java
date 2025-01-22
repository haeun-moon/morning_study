import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T=sc.nextInt();
		int[][] arr = new int[100][100];
		int sum=0;
		for (int t=0;t<T;t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i=n;i<n+10;i++) {
				for (int j=m;j<m+10;j++) {
					arr[i][j]=1;
				}
			}
		}
		// 세로방향 스캔
		for (int i=0;i<100;i++) {
			for (int j=0;j<99;j++) {
				// 둘중 하나만 1일 때 둘레에 1을 더한다.
				boolean chk1 = (arr[i][j]^arr[i][j+1])==1;
				// 경계에 있어도 둘레에 1을 더한다
				boolean chk2 = (arr[i][j]==1&&j==0)||(arr[i][j+1]==1&&j==98);
				if (chk1||chk2) sum++;
			}
		}
		
		// 가로방향 스캔
		for (int i=0;i<99;i++) {
			for (int j=0;j<100;j++) {
				// 둘중 하나만 1일 때 둘레에 1을 더한다.
				boolean chk1 = (arr[i][j]^arr[i+1][j])==1;
				// 경계에 있어도 둘레에 1을 더한다
				boolean chk2 = (arr[i][j]==1&&i==0)||(arr[i+1][j]==1&&i==98);
				if (chk1||chk2) sum++;
			}
		}
		System.out.println(sum);
	}
}