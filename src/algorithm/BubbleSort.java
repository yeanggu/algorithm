package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int data[] = {4,5,2,3,1};//오름차순{1,2,3,4,5}
		System.out.println("버블정렬 이전 = "+Arrays.toString(data));
		bubble(data, data.length);
		//data 객체 매개변수 전달되면 bubble 메소드 내부 data 배열내부 값 변경
		System.out.println("버블정렬 이후 = "+Arrays.toString(data));
		
		
	}
	
	static void bubble(int[] a, int n) {
		for(int i=0;i<a.length-1;i++) {//1번 인덱스에 2번째 작은 값 저장, 2번인덱스 3번째 작은값 저장, ...
			for(int j=0;j<a.length-i-1;j++) {//4개와 오른쪽 데이터 각각 비교 - 0번 인덱스에 가장 작은 값 저장
				System.out.print("i="+i+" , j="+j+" 반복중 ");
				if(a[j] > a[j+1]) {//2개 데이터 정렬
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			System.out.println(Arrays.toString(a));
			}
		}
	}
}
