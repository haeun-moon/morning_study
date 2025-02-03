package boj;

import java.util.Scanner;

public class Boj_2527_직사각형 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		for(int i=0; i<1; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			
			// 관계없음 -> 점 -> 선분 순서로 조건을 검사
			// 다음 조건으로 넘어 갈수로 선행된 조건 검사에서 어떤 케이스가 확인 되었는지 잘 기억하면서 넘어가야 할 듯 
			if(x2 < x3 || x1 > x4 || y1 > y4 || y2 < y3) {
				System.out.println("d");
			} else if((x2 == x3 && y1 == y4) || (x1 == x4 && y1  == y4) || (x1 == x4 && y2 == y3) || (x2 == x3 && y2 == y3)) {
				// 첫 번째 조건식에서 관계없는 경우 검사 -> 고려X
				System.out.println("c");
			} else if(x2 == x3 || x1 == x4 || y2 == y3 || y1 == y4) {
				// 관계없는 경우, 점에서 만는 경우 검사 -> 고려X
				System.out.println("b");
			} else {
				System.out.println("a");
			}
		}
	}
}