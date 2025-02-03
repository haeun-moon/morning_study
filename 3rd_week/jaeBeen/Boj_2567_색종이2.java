package boj;

import java.util.Scanner;

public class Boj_2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] xy = new int[n][2];
		int[][] map = new int[101][101];
		
		// 입력받은 좌표에 해당하는 색종이를 map에 표시해줌
		for(int i=0; i<xy.length; i++) {
			int x = xy[i][0] = sc.nextInt();
			int y = xy[i][1] = sc.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(map[j][k] == 0) {
						map[j][k]++;
					}
				}
			}
		}
		
		// 색종이가 없다가 있는 곳 -> 둘레
		// 색종이가 있는 곳일 때 흰 도화지의 가장자리에 붙어있는지 확인
		// 가장자리가 아닌경우 상하좌우 중 색종이가 없는 곳이 있는지 확인 
		int count = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				int now = map[i][j];
				if(now == 1) {
					if(i == 0 || i == map.length-1) {
						count++;
					} else if(now != map[i-1][j] || now != map[i+1][j]){
						count++;
					}
					if(j == map.length-1 || j == 0 ) {
						count++;
					} else if(now != map[i][j-1] || now != map[i][j+1]) {
						count++;
					}
				} 
			}
		}
		System.out.println(count);
	}
}
