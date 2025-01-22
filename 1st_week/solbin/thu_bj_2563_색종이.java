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
					if (arr[i][j]==0) sum++;
					arr[i][j]=1;
				}
			}
		}
		System.out.println(sum);
	}
}