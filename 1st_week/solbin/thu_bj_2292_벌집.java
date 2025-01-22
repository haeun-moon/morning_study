import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int index = 1;
		int dist = 0;
		while (true) {
			dist+=6;
			if (n<=index) {
				break;
			} else {
				index+=dist;
			}
		}
		System.out.println(dist/6);
	}
}
