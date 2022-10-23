package algorithm;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int data[] = {3,5,4,2,1};//오름차순{1,2,3,4,5}
		System.out.println("쉘정렬 이전 = "+Arrays.toString(data));
		Shell(data, data.length);
		System.out.println("쉘정렬 이후 = "+Arrays.toString(data));
		
		
	}
	
	static void Shell(int[] a, int n) {
		for(int h=n/2;h>0;h=h/2) {//h->2 1
			for(int i=h;i<n;i++) {
				int j;
				//1. 정렬되지 않은 데이터 한개를 선택한다
				int tmp = a[i];//복사
				System.out.printf("h=%d,i=%d,tmp=%d 반복\n",h,i,tmp);
				//2. 절렬된 데이터들 자리 이동 (tmp 크면) 반복(4 7 8 -5)
				for(j=i-h;j>=0 && a[j]>tmp;j=j-h) {
					System.out.printf("현재 a[j]값 %d 은 tmp값 %d보다 크므로 자리 밀리는 중 : \n", a[j],tmp);
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
				System.out.println("==밀어내고 삽입 중간결과 : "+ Arrays.toString(a));
				//3. 1번 데이터를 2번 빈 자리에 삽입
			}
		}
		
		
		
		
		
		
	}
}
