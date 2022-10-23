package algorithm;

import java.util.Scanner;

public class Test1 {
		
		static String palindrome(String[] eng){
			System.out.print("결과값 = ");
			int j = 0;
			
			for(int i=0;i<eng.length/2;i++) {
				if(eng[i].equals(eng[eng.length-i-1])) {
					j++;
				}
			}
			
			if(j==eng.length/2) {
				return "1";
			}
			return "0";
			
		}
		
		public static void main(String[] args) {	
			
			Scanner scan = new Scanner(System.in);
			System.out.println("1부터 100까지의 숫자중 하나를 입력하세요.");
			System.out.print("단어 갯수 = ");
			int num = scan.nextInt();
			String[] count = new String[num];
			
			while(true) {
				
				if(num>=1 && num<=100) {
					for(int i=0;i<num;i++) {
						System.out.print(i+1+". 테스트할 단어 = ");
						count[i] = scan.nextLine();
						String line = scan.next();
						String[] eng = line.split("");
						System.out.println(palindrome(eng));
					}
					System.out.println("결과 도출이 완료되었습니다.");
					break;
					
				}else {
					System.out.println("숫자를 다시 입력하세요.");
					System.out.print("단어 갯수 = ");
					num = scan.nextInt();
				}
			}
			
		}
}		


//for(int j=0;j<eng.length;j++) {
//	if(eng.charAt(j)>=97 && eng.charAt(j)<=122) {
//	}else {
//		System.out.println("영소문자를 입력하세요.");
//		System.out.print("테스트할 단어 = ");
//		
//	}
//}

