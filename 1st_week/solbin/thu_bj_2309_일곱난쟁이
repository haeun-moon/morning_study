import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[9];
		int sum = 0;
		for (int i=0;i<9;i++) {
			int tmp = sc.nextInt();
			arr[i] = tmp;
			sum+=tmp;
		}
		Arrays.sort(arr);
		int a=-1;
		int b=-1;
		loop:
		for (int i=0;i<8;i++) {
			for (int j=i+1;j<9;j++) {
				int tmp = sum;
				tmp-=arr[i];
				tmp-=arr[j];
				if (tmp==100) {
					a=i;
					b=j;
					break loop; 
				}
			}
		}
		for (int i=0;i<9;i++) {
			if (i!=a&&i!=b) System.out.println(arr[i]);
		}
	}
}
