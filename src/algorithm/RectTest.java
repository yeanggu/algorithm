package algorithm;

import java.util.Scanner;

public class RectTest {
	
	static void rect(int w) {
		for(int line=1;line<=w;line++) {
			for(int i=1;i<=w;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	
	static void tri(int w) {
		for(int line=1;line<=w;line++) {
			for(int i=1;i<=line;i++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
	
	static void tris(int w) {
		for(int line=1;line<=w;line++) {
			for(int i=w;i>=line;i--) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		System.out.println("============================");
	
		for(int line=1;line<=w;line++) {
			for(int i=w;i>line;i--) {
				System.out.print(" ");
			}
			for(int i=1;i<=line;i++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println("============================");
		
		for(int line=1;line<=w;line++) {
			for(int i=1;i<line;i++) {
				System.out.print(" ");
			}
			for(int i=w;i>=line;i--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("============================");
		
		for(int line=1;line<=w;line++) {
			for(int i=1;i<line;i++) {
				System.out.print(" ");
			}
			int su = w;
			for(int i=w;i>=line;i--) {
				System.out.print(su--);
			}
		System.out.println();
		}
		System.out.println("============================");
		
		int su = 65;
		for(int line=1;line<=w;line++) {
			for(int i=1;i<line;i++) {
				System.out.print(" ");
			}
			for(int i=w;i>=line;i--) {
				System.out.print((char)su++);
			}
		System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
		System.out.println("숫자 1개를 입력하세요");
		System.out.print("한변의 길이 = ");
		int width = stdIn.nextInt();
		//음수이거나 0입력시 종료
		if(width<=0) {break; }
		rect(width);
		System.out.println("============================");
		tri(width);
		System.out.println("============================");
		tris(width);
		}
	}	
}
