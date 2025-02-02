import java.util.Scanner;
class Main
{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws Exception
	{
		int sum=0;
		int diff = 100;
		for (int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			sum += input;
            // 차이가 다시 상승하기 시작하는 지점에서 break
			if (Math.abs(100-sum)>diff) {
				sum -=input ;
				break;
			} else {
				diff = Math.abs(100-sum);
			}
		}
		System.out.println(sum);
	}
}