package boj;

import java.util.Scanner;

public class Boj_2851_슈퍼마리오 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		int result = 0;
		
		
		/*
		 * 입력을 받으면서 더한 값을 구하고
		 * 100에서 더한 값을 뺀 절대값과 100에서 결과에 해당하는 값을 뺀 절대값을 비교
		 * 100에서 뺀 절대값이 작음 -> 100에 가까움 -> 결과값
		 * 절대값이 같은 경우 둘 중 큰 값 -> 결과값 
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(Math.abs(100-sum) <= Math.abs(100-result)) {
				result = sum;
			}
		}
		System.out.println(result);
	}
}
