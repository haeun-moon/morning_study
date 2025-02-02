import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T=sc.nextInt();
        // 배열로 풀면 시간복잡도가 크지만 100x100으로 제한돼있어서 괜찮을듯
		boolean[][] arr = new boolean[100][100];
		int sum=0;
		for (int t=0;t<T;t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i=n;i<n+10;i++) {
				for (int j=m;j<m+10;j++) {
					if (!arr[i][j]) sum++;
					arr[i][j]=true;
				}
			}
		}
		System.out.println(sum);
	}
}