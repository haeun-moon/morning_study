package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_1244_스위치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스위치의 수
		int input = sc.nextInt();
		int[] arr = new int[input];

		// 스위치 상태 입력
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		// 학생의 수
		int student = sc.nextInt();
		int[] arrS = new int[student];
		int[] arrSn = new int[student];

		// 학생의 성별, 학생이 가진 스위치번호 입력
		for (int i = 0; i < student; i++) {
			arrS[i] = sc.nextInt();
			arrSn[i] = sc.nextInt();
		}
		// 학생의 수만큼 스위치에 변화
		for (int i = 0; i < arrS.length; i++) {
			int switchNum = arrSn[i];
			int sex = arrS[i];
			if (sex == 1) {
				// 성별이 남성일 때 스위치 번호로 나누어 떨어지는(스위치 번호의 배수) 스위치의 상태 변경
				for (int j = 0; j < arr.length; j++) {
					if ((j + 1) % switchNum == 0) {
						arr[j] = arr[j] == 0 ? 1 : 0;
					}
				}
			} else {
				// 성별이 여성일 때 스위치 번호의 스위치 상태를 우선 변화 시키고 양옆의 스위치 검사
				arr[switchNum - 1] = arr[switchNum - 1] == 0 ? 1 : 0;
				// 양 옆의 스위치의 상태가 같지 않거나 인덱스를 벗어나는지 확인하기 위한 boolean 값 
				// 현재스위치 번호에서 양옆으로 k만큼 떨어진 스위치를 비교하여 같으면 스위치의 상태를 변화시키고 거리 1증가, 인덱스를 벗어나는지 확인 -> 조건에 해당하지 않으면 break
				for (int k = 1; k < arr.length / 2; k++) {
					if (
						switchNum - k >= 1 &&
						switchNum + k <= arr.length &&
						(arr[switchNum - 1 - k] == arr[switchNum - 1 + k])
					) {
						arr[switchNum - 1 - k] = arr[switchNum - 1 - k] == 0 ? 1 : 0;
						arr[switchNum - 1 + k] = arr[switchNum - 1 + k] == 0 ? 1 : 0;
					} else {
						break;
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if((i+1)%20 == 0) {
				System.out.println("");
			}
		}
	}
}