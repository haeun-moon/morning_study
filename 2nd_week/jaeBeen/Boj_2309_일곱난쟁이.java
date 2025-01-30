package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2309_일곱난쟁이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] shorts = new int[9];
		int total = 0;
		
		for(int i=0; i<shorts.length; i++) {
			total += shorts[i] = sc.nextInt();
		}
		
		// 난쟁이 키 합 - 100 에 해당하는 난쟁이 조합 찾기
		// j = i+1 -> 중복, arr[0]+arr[1]은 이미 검사 arr[1]+arr[0] 할 필요X 
		loop:
		for(int i=0; i<shorts.length; i++) {
			for(int j=i+1; j<shorts.length; j++) {
				if(shorts[i] + shorts[j] == total-100) {
					shorts[i] = 0;
					shorts[j] = 0;
					break loop;
				}
			}
		}
		// 스파이 자리는 0, 오름차순으로 정렬한 뒤 idx 2부터 출력 
		Arrays.sort(shorts);
		for(int i=2; i<9; i++) {
			System.out.println(shorts[i]);
		}
	}
}
