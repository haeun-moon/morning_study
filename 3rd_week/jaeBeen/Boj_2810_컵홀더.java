package boj;

import java.util.Scanner;

public class Boj_2810_컵홀더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanCnt = sc.nextInt();
		String seats = sc.next();
		int count = 1;
		// 좌석배치를 String 으로 받아 idx별 좌석 정보에 따라 컵홀더 수++
		// 사람수보다 컵홀더가 많으면 사람수, 아니면 컵홀더 수 출력
		for(int i=0; i<seats.length(); i++) {
			char tmp = seats.charAt(i); 
			if(tmp == 'S') {
				count++;
			} else if(tmp == 'L') {
				i++;
				count++;
			}
		}
		System.out.println(count > humanCnt? humanCnt:count);
	}
}
