import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (int x=0;x<4;x++) {
			int x11 = sc.nextInt();
			int y11 = sc.nextInt();
			int x12 = sc.nextInt();
			int y12 = sc.nextInt();
			
			int x21 = sc.nextInt();
			int y21 = sc.nextInt();
			int x22 = sc.nextInt();
			int y22 = sc.nextInt();
			
			// Dot
			boolean c1 = x12==x21&&y12==y21;
			boolean c2 = x12==x21&&y11==y22;
			boolean c3 = x11==x22&&y12==y21;
			boolean c4 = x11==x22&&y11==y22;
			
			// Line
			boolean b1 = ((x11<=x21&&x12>=x21)||(x11<=x22&&x12>=x22))&&(y12==y21||y11==y22);
			boolean b2 = ((x21<=x11&&x22>=x11)||(x21<=x12&&x22>=x12))&&(y12==y21||y11==y22);
			boolean b3 = ((y11<=y21&&y12>=y21)||(y11<=y22&&y12>=y22))&&(x12==x21||x11==x22);
			boolean b4 = ((y21<=y11&&y22>=y11)||(y21<=y12&&y22>=y12))&&(x12==x21||x11==x22);
			
			// None
			boolean d1 = x11>x22||x12<x21||y11>y22||y12<y21;
			
			if (c1||c2||c3||c4) {
				//dot
				System.out.println("c");
			} else if (b1||b2||b3||b4) {
				//line
				System.out.println("b");
			} else if (d1) {
				//none
				System.out.println("d");
			} else {
				//square
				System.out.println("a");
			}
		}
	}
}
