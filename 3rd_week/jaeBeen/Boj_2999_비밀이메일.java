package boj;

import java.util.Scanner;

public class Boj_2999_비밀이메일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int n = str.length();
		int r = 1;
		int c = n;
		
		// 곱하여 n이 될 수 있는 r,c -> n을 r,c로 나눈 나머지 = 0
		// r<=c -> 반복문을 돌면서 r,c 재정의
		for(int i=1; i < n; i++) {
			if(n % i == 0 && c > i) {
				r = i;
				c = n / i;
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(str.charAt(i + (j*r)));
			}
		}
	}
}