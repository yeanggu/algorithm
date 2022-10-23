package algorithm;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int[] data = {6,4,3,2,1,5,8};
//		int[] data2 = {1,2,3,4,5,6,8};

		//api 배열 정렬 api
		Arrays.sort(data);//data 배열 내부 정렬 변경
		
//		for(int i=0;i<data.length;i++) {
//			System.out.print(data[i]+" , ");
//		}
		
		//data 전체 내용 출력
		System.out.println(Arrays.toString(data));
		
		System.out.println();
		
		int target = 5;
		int index = Arrays.binarySearch(data, target);
		//index < 0 - 못찾음
		System.out.println(target + "을 " +index+" 튀치에서 찾았음");
		//내림차순 정렬 또는 사용자정렬기준 정하여 구현
		
		//Comparator
//		class A implements Comparator{
//			compare(){A 객체들 사용자 정의 정렬 순서 구현}
//		}
	}

}
