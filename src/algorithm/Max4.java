package algorithm;

import java.util.Scanner;

public class Max4 {
		static int max(int a, int b, int c, int d){
			//4개 매개변수 중에서 최대값 리턴
			int max = a;//기준값
			System.out.println("max 최초값 ="+max);
			if(b>max) {
				max = b;
				System.out.println("max 변경값 ="+max);
			}
			if(c>max) {
				max = c;
				System.out.println("max 변경값 ="+max);
			}
			if(d>max) {
				max = d;
				System.out.println("max 변경값 ="+max);
			}
			return max;
		}
	public static void main(String[] args) {	
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("숫자 4개를 입력하세요");
		System.out.print("a= ");
		int a = stdIn.nextInt();
		System.out.print("b= ");
		int b = stdIn.nextInt();
		System.out.print("c= ");
		int c = stdIn.nextInt();
		System.out.print("d= ");
		int d = stdIn.nextInt();
		
		System.out.println("최대값 ="+max(a,b,c,d));
		System.out.println("최대값 ="+max(23,42,34,25));
		System.out.println("최대값 ="+max(45,23,54,25));
	}

}
