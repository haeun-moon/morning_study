package boj;

import java.util.Scanner;

public class Boj_2941_크로아티아알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		int count = 0;
		
		// 입력받은 문자열의 알파벳을 하나씩 검사하며 특정 알파벳일 경우 다음 글자를 확인 
		// -> 알파벳 표기에 해당하면, 확인을 위한 인덱스를 +1, +2하여 검사하지 않고 다음 알파벳부터 검사  
		for(int i=0; i<length; i++) {
			char tmp = str.charAt(i);
			if (tmp == 'c' && i <= length-2 && (str.charAt(i+1) == '=' || str.charAt(i+1) == '-')) {
				i = i + 1;
			} else if(tmp == 'd' && i <= length-2) {
				if(str.charAt(i+1) == '-') {
					i = i + 1;
				} else if(i <= length -3 && str.charAt(i+1) == 'z' &&  str.charAt(i+2) == '=') {
					i = i + 2;
				}
			} else if(i <= length-2 && (tmp == 'l' || tmp == 'n') && str.charAt(i+1) == 'j') {
				i = i + 1;
			} else if(i <= length-2 && (tmp == 's' || tmp == 'z') && str.charAt(i+1) == '=') {
				i = i + 1;
			}
			count++;
		}
		System.out.println(count);
	}
}
