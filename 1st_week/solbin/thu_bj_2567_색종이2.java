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
		// ���ι��� ��ĵ
		for (int i=0;i<100;i++) {
			for (int j=0;j<99;j++) {
				// ���� �ϳ��� 1�� �� �ѷ��� 1�� ���Ѵ�.
				boolean chk1 = (arr[i][j]^arr[i][j+1])==1;
				// ��迡 �־ �ѷ��� 1�� ���Ѵ�
				boolean chk2 = (arr[i][j]==1&&j==0)||(arr[i][j+1]==1&&j==98);
				if (chk1||chk2) sum++;
			}
		}
		
		// ���ι��� ��ĵ
		for (int i=0;i<99;i++) {
			for (int j=0;j<100;j++) {
				// ���� �ϳ��� 1�� �� �ѷ��� 1�� ���Ѵ�.
				boolean chk1 = (arr[i][j]^arr[i+1][j])==1;
				// ��迡 �־ �ѷ��� 1�� ���Ѵ�
				boolean chk2 = (arr[i][j]==1&&i==0)||(arr[i+1][j]==1&&i==98);
				if (chk1||chk2) sum++;
			}
		}
		System.out.println(sum);
	}
}