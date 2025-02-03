package boj;

import java.util.Scanner;

public class Boj_2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 100 * 100의 흰 도화지
		int[][] field = new int[100][100];
		
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int count = 0;
		
		//x,y좌표를 받아 x+10, y+10까지 돌면서 0이면 1을 넣고 카운트++ -> 겹쳐지더라도 1번만 카운팅
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(field[j][k] == 0) {
						field[j][k] = 1;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
