import java.util.*;
class Main
{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        boolean isFliped = false;
        int sum = n;
        for (int i=0;i<n-1;i++) {
        	if (arr[i]=='L'&&arr[i+1]=='L') {
        		if (isFliped) {
                    // 커플석 만날때마다 컵 개수를 줄임
        			sum--;
                    // 이미 지나온 길은 싱글이라고 표시함
        			arr[i]='S';
        			arr[i+1]='S';
        		} else {
                    // 커플석이 처음 나오는 곳에서 컵홀더 방향을 뒤집음.
        			isFliped=true;
        			arr[i]='S';
        			arr[i+1]='S';
        		}
        	}
        }
        System.out.println(sum);
    }
} 