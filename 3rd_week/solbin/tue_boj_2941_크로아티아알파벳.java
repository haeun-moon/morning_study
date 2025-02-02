import java.util.*;
class Main
{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {
    	String str = sc.next();
    	int len = str.length();
    	for (int i=1;i<str.length();i++) {
    		char a = str.charAt(i);
    		if (a=='=') {
    			char b = str.charAt(i-1);
    			if (b=='z') {
    				// dz= 체크
    				if (i>1&&str.charAt(i-2)=='d') {
    					len-=2;
    				} else {
    					// z= 체크
    					len-=1;
    				}
    			} else if (b=='s'||b=='c') {
    				// s=, c= 체크
    				len-=1;
    			}
    		} else if (a=='-') {
    			char b = str.charAt(i-1);
    			// c-, d- 체크
    			if (b=='c'||b=='d') len-=1;
    		} else if (a=='j') {
    			char b = str.charAt(i-1);
    			// lj, nj 체크
    			if (b=='l'||b=='n') len-=1;
    		}
    	}
    	System.out.println(len);
    }
} 