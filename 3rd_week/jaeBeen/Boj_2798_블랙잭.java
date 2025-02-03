package boj;

import java.util.Scanner;

public class Boj_2798_블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		// 중복해서 뽑을 수 없고, idx 1,2,3/1,3,2같은 경우의 중복검사를 방지하기 위해 j = i + 1, k = j + 1
		// idx를 돌면서 합을 구해 목표값(m)과 비교
		// 목표값을 찾으면 반복문을 돌 필요가 없기 때문에 break loop
		loop:
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					int tmp = arr[i] + arr[j] + arr[k];
					if(tmp <= m && tmp > sum) {
						sum = tmp;
					}
					if(sum == m) {
						break loop;
					}
				}
			}
		} 
		System.out.println(sum);
	}
}
