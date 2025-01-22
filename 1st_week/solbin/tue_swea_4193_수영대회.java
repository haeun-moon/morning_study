package morning_study.solbin;
import java.util.*;
 
public class D4_4193_수영대회 {
	final static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int T = sc.nextInt();
		for (int t= 1; t<= T; t++) {
			System.out.println("#" + t + " " + run());
		}
	}
	private static int n;
	private static int min;
	static int fx;
	static int fy;
	static Queue<int[]> queue = new LinkedList<>();
	private static String run() {
		n = sc.nextInt();
		min = -1; // 도착 불가인 경우 -1 출력
		queue.clear(); // 큐 초기화
		int[][] arr = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt(); // 시작점 x
		int y = sc.nextInt(); // 시작점 y
		fx = sc.nextInt(); // 도착점 x
		fy = sc.nextInt(); // 도착점 y
		queue.add(new int[]{x,y,0});
		while (!queue.isEmpty()) {
			int[] qe = queue.poll();
			move(arr,qe[0],qe[1],qe[2]);
		}
		return String.valueOf(min);
	}
	private static void move(int[][] arr, int x, int y, int tt) {
		// 앞의 소용돌이가 열리지 않았을 경우 시간을 더하고 큐에 다시 추가
		if (arr[x][y] == 2&&tt%3!=0) {
			queue.add(new int[] {x,y,++tt});
			return;
		}
		// 도착!!
		if (x==fx&&y==fy) {
			if (min==-1||min>tt) min=tt;
			return;
		}
		// 이미 지나간 길은 벽으로 막음. visited[][]와 같음
		arr[x][y] = 1;
		// 상하좌우로 움직일 때 벽이 없다면 시간을 더하고 한칸 이동
		int[] dx = new int[] {-1,1,0,0};
		int[] dy = new int[] {0,0,-1,1};
		tt++;
		for (int i=0;i<4;i++) {
			if (bound(x+dx[i],y+dy[i],arr)) queue.add(new int[] {x+dx[i],y+dy[i],tt});
		}
	}
	
	// 테두리나 벽에 막혔는지 판단
	private static boolean bound(int x,int y,int[][] arr) {
		return (!(x<0||x>=n||y<0||y>=n)&&arr[x][y]!=1);
	}
}