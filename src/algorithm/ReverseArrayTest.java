package algorithm;

import java.util.Scanner;

public class ReverseArrayTest {
		static int[] reverse(int[] data){//main 호출 max(suInt)
			System.out.println("====max메소드내부====");
			for(int i=0;i<data.length;i++) {
				System.out.print("data["+i+"]="+data[i]+",");
			}
			System.out.println();
			//data 배열 역순
			
			for(int i=0;i<data.length/2;i++) {// 5/2->2(0,1 2번반복)
				new ReverseArrayTest().swap(data, i,data.length-i-1);
//				int temp = data[i];//첫번째값 복사
//				data[i] = data[data.length-i-1];//첫번째 자리에 마지막 데이터 복사
//				data[data.length-i-1]=temp;//마지막 자리에 첫번째 데이터 복사
			}
			return data;
		}//reverse end
		
		void swap(int[] ar, int i, int j){
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		
		
	public static void main(String[] args) {	
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 갯수 = ");//5
		int count = stdIn.nextInt();
		stdIn.nextLine();
		
		System.out.println("역순으로 정렬할 숫자들 = ");
		String line = stdIn.nextLine();//배열 -> 100 90 34 78 19 -> 배열 리턴 -> 19 78 34 90 100
		//공백중심 분리
		
		String[] su = line.split(" ");
		int[] suInt = new int[count];
		for(int i=0;i<count;i++) {
		suInt[i] = Integer.parseInt(su[i]);
		}

		reverse(suInt);
		
		System.out.println("=====main 메소드 내부======");
		for(int i=0;i<suInt.length;i++) {
			System.out.print("suInt["+i+"]="+suInt[i]+",");
		}
			System.out.println();
	}

}
