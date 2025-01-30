package boj;

import java.util.Scanner;

public class Boj_1592_영식이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int[] arr = new int[n];
		int idx = 0;
		int turn = 0;
		
		// 왼쪽으로 l만큼 갔을 때 idx의 값을 구하기
		while(true) {
			if(arr[idx] % 2 == 0) {
				idx = (idx - l + n) % n;
			} else {
				idx = (idx + l) % n;
			}
			// 변경된 idx에서 들어있는 값 1증가 후 종료조건 검사
			if(++arr[idx] == m) {
				break;
			} else {
				turn++;
			}
		}
		System.out.println(turn);	
	}
}
