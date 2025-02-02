import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T=sc.nextInt();
		// 경계를 고려하여 상하좌우 한칸씩 늘린다.
		boolean[][] arr = new boolean[102][102];
		int sum=0;
		for (int t=0;t<T;t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i=n;i<n+10;i++) {
				for (int j=m;j<m+10;j++) {
					arr[i][j]=true;
				}
			}
		}
		for (int i=0;i<100;i++) {
			for (int j=0;j<101;j++) {
                // 가로방향 스캔
				// 둘중 하나만 1일 때 둘레에 1을 더한다.
				if (arr[j][i]^arr[j][i+1]) sum++;

                // 세로방향 스캔
				if (arr[i][j]^arr[i+1][j]) sum++;
			}
		}
		System.out.println(sum);
	}
}