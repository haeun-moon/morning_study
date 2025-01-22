package com.ssafy.ws.step3;

import java.util.*;

public class SwitchTest {
	public static void main(String[] args) {
		// 코드를 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arrN = new int[N]; // 스위치 배열
		int[] numM = new int[M]; // 입력받은 M개 수 배열
		
		for ( int i = 0 ; i < M ; ++i) {
			
			numM [i]= sc.nextInt(); //  입력받은 수 배열에 넣기

			for ( int j = 0 ; j < N ; ++j) {
				
				if ((j+1)%numM[i]==0) {
					++arrN[j]; // 1번부터 시작하는 스위치의 위치가 입력받은 수의 배수일 때 스위치 배열에 1씩 더하기
				}
			}
		}
		
		
		for (int i = 0 ; i < N; ++i) {
			arrN[i] = arrN[i]%2; // 스위치 배열에 더해진 각 수를 2로 나누기
			System.out.print(arrN[i]+" ");
		}
	}
}
