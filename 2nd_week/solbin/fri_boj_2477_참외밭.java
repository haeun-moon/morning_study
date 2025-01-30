import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int k = sc.nextInt();
		int[] dir = new int[6];
		int[] len = new int[6];
		for (int i=0;i<6;i++) {
			dir[i] = sc.nextInt();
			len[i] = sc.nextInt();
		}
		int ret = big(len)-small(len);
		System.out.println(ret*k);
	}
	static int small(int[]len) {
		int small=1;
		for (int i=0;i<6;i++) {
			if (len[i]+len[bound(i-2)]==len[bound(i+2)]&&len[bound(i-1)]+len[bound(i+1)]==len[bound(i+3)]) {
				small*=len[bound(i)];
			} else if (len[i]+len[bound(i+2)]==len[bound(i-2)]&&len[bound(i-1)]+len[bound(i+1)]==len[bound(i-3)]) {
				small*=len[bound(i)];
			}
		}
		return small;
	}
	static int big(int[]len) {
		int big=1;
		for (int i=0;i<6;i++) {
			if (len[bound(i+2)]+len[bound(i-2)]==len[bound(i)]) {
				big*=len[bound(i)];
			}
		}
		return big;
	}
	static int bound(int i) {
		return (i+6)%6;
	}
}
