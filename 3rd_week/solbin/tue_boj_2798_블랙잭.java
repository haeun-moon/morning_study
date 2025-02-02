import java.util.*;
class Main
{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        }
        int max=0;
        for (int i=0;i<n-2;i++) {
        	for (int j=i+1;j<n-1;j++) {
        		for (int k=j+1;k<n;k++) {
        			int sum=0;
        			sum+=arr[j];
        			sum+=arr[i];
        			sum+=arr[k];
        			if (sum>max&&sum<=m) max=sum;
        		}
        	}
        }
        System.out.println(max);
    }
}