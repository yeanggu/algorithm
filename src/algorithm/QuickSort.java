package algorithm;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int data[] = {4,5,2,3,1};//오름차순{1,2,3,4,5}
		System.out.println("퀵정렬 이전 = "+Arrays.toString(data));
		quick(data, 0,data.length-1);
		System.out.println("퀵정렬 이후 = "+Arrays.toString(data));
		
	}
	
	static void quick(int[] a, int left, int right) {
		//System.out.printf("===left=%d 이고 right=%d 일 때 quick 시작===\n",left,right);
		int pl = left;//왼쪽부터 검색 인덱스 변수. pl++
		int pr = right;//오른쪽부터 검색 인덱스 변수.pr--
		int x = a[(pl + pr)/2];
		do {
			//a[pl] < x = pl++
			while(a[pl]<x) {//a[pl] 데이터가 x보다 크거나 같으면 중단
				System.out.printf("피벗 %d 과 현재데이터 %d 비교하여 %d가 더 큼. pl 현재 %d에서 1증가 \n",x,a[pl],x,pl);
				pl++;
			}
			//a[pr] > x = pr--
			while(a[pr]>x) {//a[pr] 데이터가 x보다 작거나 같으면 중단
				System.out.printf("피벗 %d 과 현재데이터 %d 비교하여 %d가 더 작음. pr 현재 %d에서 1감소 \n",x,a[pr],x,pr);
				pr--;
			}
			//pl <= pr 두 데이터 교환.pl++,pr--
			if(pl <= pr) {
				System.out.printf("p1=%d, pr=%d에서 %d %d 교환 발생\n",pl,pr,a[pl],a[pr]);
				int temp = a[pl];
				a[pl] = a[pr];
				a[pr] = temp;
				pl++;
				pr--;
			}
		}while(pl<=pr);//1개짜리배열 중단 pl=0 pr=0
		
		System.out.printf("pl=%d, pr=%d에서 반복 종료 - 배열=%s\n",pl,pr,Arrays.toString(a));
		//2그룹 동일 크기 아니다
		if(left<pr) quick(a,left,pr);//피봇보다 작거나 같은 그룹 분할
		if(pl<right) quick(a,pl,right);//피봇보다 크거나 같은 그룹 분할
		//System.out.printf("===left=%d 이고 right=%d 일 때 quick 종료===\n",left,right);
		
	}
}
