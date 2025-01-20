package morning_study.solbin;
import java.util.*;
class D4_1868_지뢰찾기
{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {
        int T = sc.nextInt();
        for (int t=1;t<=T;t++) {
            System.out.println("#" + t + " " + run());
        }
    }
    static int n, click;
    private static String run() {
        n = sc.nextInt();
        click = 0;
        char[][] arr = new char[n][n];
        for (int i=0;i<n;i++) {
        	String tmp = sc.next();
        	for (int j=0;j<n;j++) {
        		arr[i][j] = tmp.charAt(j);
        	}
        }
        for (int i=0;i<n;i++) {
        	for (int j=0;j<n;j++) {
        		if (arr[i][j] == '.') {
        			mineChk(arr,i,j,false);
        		}
        	}
        }
        for (int i=0;i<n;i++) {
        	for (int j=0;j<n;j++) {
        		if (arr[i][j] == '1') {
        			click++;
        		}
        	}
        }
        return String.valueOf(click);
    }
        
    private static void mineChk(char[][] arr, int x, int y, boolean bCnnt) {
    	boolean bChk = false;
    	loop:
    	for (int i=bound(x-1);i<=bound(x+1);i++) {
    		for (int j=bound(y-1);j<=bound(y+1);j++) {
        		if (arr[i][j] == '*') {
        			bChk = true;
        			break loop;
        		}
        	}
    	}
    	if (!bCnnt&&bChk) {
    		arr[x][y] = '1';
    	} else if (bCnnt&&bChk) {
    		arr[x][y] = '2';
    	} else {
    		if (!bCnnt) click++;
    		arr[x][y] = '2';
    		for (int i=bound(x-1);i<=bound(x+1);i++) {
        		for (int j=bound(y-1);j<=bound(y+1);j++) {
        			if (arr[i][j]!='2'&&arr[i][j]!='*') mineChk(arr,i,j,true);
            	}
        	}
    	}
    }
    
    private static int bound(int i) {
    	if (i<0) return 0;
    	if (i>=n) return n-1;
    	return i;
    }
}