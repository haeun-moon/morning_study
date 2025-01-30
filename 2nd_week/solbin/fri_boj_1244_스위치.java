import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//학생수
		int cnt = sc.nextInt();
		for (int i=0;i<cnt;i++) {
			//성별
			int s = sc.nextInt();
			//위치
			int p = sc.nextInt();
			if (s==1) {
				for (int k=1;k*p<=n;k++) {
					arr[k*p-1]=1-arr[k*p-1];
				}
			} else {
				arr[p-1]=1-arr[p-1];
				int k = p-1;
				int l = p-1;
				while(true) {
					if (k>=0&&k<n&&l>=0&&l<n&&arr[k]==arr[l]) {
						arr[k]=1-arr[k];
						arr[l]=1-arr[l];
						k--;
						l++;
					} else {
						break;
					}
				}
			}
		}
		for (int i=0;i<n;i++) {
			if (i%20!=0) System.out.print(" ");
			System.out.print(arr[i]);
			if (i%20==19) System.out.println();
		}
		sc.close();
	}
}
