import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int index = 0;
		int[] arr = new int[n];
		int sum = 0;
		arr[0] = 1;
		while (true) {
			if (m<=1) break;
			index = dir(index,arr[index],m,n,l);
			arr[index] = arr[index]+1;
			sum++;
			if (arr[index]>=m) break;
		}
		System.out.println(sum);
	}
    
    // ���� ������ �ϴ��� �Ǻ�
	public static int dir(int index,int cnt,int m,int n,int l) {
        //Ȧ���� ���� �ð����, ¦���϶��� �ݽð����
		if (cnt%2==1) {
			index+=l; 
		} else {
			index-=l;
		}
        // �ε��� ��谪�� ���� �ʵ���
		if (index<0) index+=n;
		return index%n;
	}
}
