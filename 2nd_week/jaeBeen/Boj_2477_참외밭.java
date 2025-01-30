package boj;

import java.util.Scanner;

// 큰 사각형 넓이 - 작은 사각형 넓이
public class Boj_2477_참외밭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1m^2 당 수확물
		int per = sc.nextInt();
		int arrLen = 6;
		int[] side = new int[arrLen]; // 방위
		int[] len = new int[arrLen]; // 길이
		
		for(int i=0; i<arrLen; i++) {
			side[i]=sc.nextInt();
			len[i]=sc.nextInt();
		}
		
		/*
		 	가로, 세로의 최대값을 가지는 len의 idx를 각각 구하고 -> idxW, idxL
		 	len에서 해당 idx에 해당하는 값 -> maxW, maxL 의 곱 = 큰 사각형의 넓이
		 	idx의 차의 절대값이 1인 경우 idx갑 중 큰 것 idx+2 idx+3
		 */
		int idxW = 0;
		int idxL = 0;
		int maxW = 0;
		int maxL = 0;
		for(int i=0; i<6; i++) {
			if(side[i]<=2) {
				if(maxW < len[i]) {
					maxW = len[i];
					idxW = i;
				}
			} else {
				if(maxL < len[i]) {
					maxL = len[i];
					idxL = i;
				}
			}
		}
		int targetIdx = 0;
		if(Math.abs(idxW-idxL) == 1) {
			targetIdx = idxW > idxL ? idxW : idxL;
		} else {
			targetIdx = idxW > idxL ? idxL : idxW;
		}
		int smallR = len[(targetIdx+2)%6] * len[(targetIdx+3)%6];
		
		System.out.println(((maxW*maxL)-smallR)*per);
	}
}
