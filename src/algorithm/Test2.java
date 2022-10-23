package algorithm;

import java.util.Scanner;

public class Test2 {
	static void star(int num){
		
		for(int line=1;line<=num;line++) {
			
			for(int i=num;i>=line;i--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=line*2-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정삼각형 크기를 입력하세요 = ");
		int num = stdIn.nextInt();
		
		star(num);

	}

}
