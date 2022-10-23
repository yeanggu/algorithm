package algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = {4,2,3,5,1};//오름차순{1,2,3,4,5}
		System.out.println("선택정렬 이전 = "+Arrays.toString(data));
		Selection(data, data.length);
		//data 객체 매개변수 전달되면 bubble 메소드 내부 data 배열내부 값 변경
		System.out.println("선택정렬 이후 = "+Arrays.toString(data));
		
		
	}
	
	static void Selection(int[] a, int n) {
		for(int i=0;i<a.length-1;i++) {//5개 4번
			System.out.println("==="+i+" 번 데이터 정렬 === "+ Arrays.toString(a));
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				System.out.print("i="+i+" , j="+j+" min= "+min+" 반복중 ");
				System.out.println(Arrays.toString(a));
				if(a[j] < a[min]) {//2개 데이터 정렬
					min = j;
				}	
					
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
}
