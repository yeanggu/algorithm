package algorithm;

import java.util.Scanner;

public class MaxArrayTest {
		static int max(int [] data){//main 호출 max(suInt)
			for(int i=0;i<data.length;i++) {
				System.out.print("data["+i+"]="+data[i]+",");
			}
			System.out.println();
			//data 배열 중에서 최대값 리턴
			//4개 매개변수 중에서 최대값 리턴
			int max = data[0];//기준값
			System.out.println("max 최초값 ="+max);
			//data.length-1
			for(int i=1;i<data.length;i++) {
				if(data[i]>max) {
					max = data[i];
					System.out.println("max 변경값 ="+max);
				}
			}
			data[0] = max;//data배열 내용 변경
			return max;
		}
	public static void main(String[] args) {	
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 갯수 = ");//5
		int count = stdIn.nextInt();
		stdIn.nextLine();
		
		System.out.println("최대값 찾을 숫자들 = ");
		String line = stdIn.nextLine();//"1 5 67 18 88"
		//공백중심 분리
		String[] su = line.split(" ");
		int[] suInt = new int[count];
		for(int i=0;i<count;i++) {
		suInt[i] = Integer.parseInt(su[i]);
		}
		
		int result = max(suInt);//suInt 배열의 최대값
		System.out.println(result);
		//기본형 + 참조형 매개변수 전달 -call by value 원리
		//참조형 주소값 복사 전달 = data, suInt 같은 주소 동일 배열 객체 참조
		System.out.println("=====main 메소드 내부======");
		for(int i=0;i<suInt.length;i++) {
			System.out.print("suInt["+i+"]="+suInt[i]+",");
		}
			System.out.println();
	}

}
