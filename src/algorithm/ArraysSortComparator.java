package algorithm;

import java.util.Arrays;
import java.util.Comparator;

/*class A implements Comparable<T>{
	public int compareTo(T other) {
		//A 자신 객체와 other 객체 비교
		//this.i>other.i return 1;
		//this.i == other.i return 0;
		//this.i < other.i return -1;
		//10<20
	}
}
//Arrays.sort(배열,COmparator하위객체);
class B implements Comparable<T>{
	public int compareTo(other, other2)) {
		//other 객체와 other2 객체 비교
		//this.i>other.i return 1;
		//this.i == other.i return 0;
		//this.i < other.i return -1;
		//10<20
	}
}*/

class MyStringSort implements Comparator<String>{//String[] 사용 정렬기준
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
		//s1,s2 대소문자 무시 같으면 0
		//s1,s2 대소문자 무시 s1 앞쪽 배열 -1(순서교환x, 다음인덱스 이동)
		//s1,s2 대소문자 무시 s2 앞쪽 배열 1(순서교환. 다음인덱스 이동)
	}
}

class MyArraySort implements Comparator<int[]>{//int[][] 사용 정렬기준 - 데이터갯수 작은->큰
	public int compare(int[] s1, int[] s2) {
		if(s1.length>s2.length) return 1;
		else if(s1.length<s2.length) return -1;
		else return 0;
	}
}

public class ArraysSortComparator {

	public static void main(String[] args) {
		String[] data = {"test","Test","test123","TeSt123","가나다"};
		//Arrays.sort(data);//문자열 자연정렬 - 대소문자 구분하지않고 문자열 같으면 같다. 사전에 순서
		//[TEST, TeSt123, test, test123, 가나다]
		
		Arrays.sort(data, new MyStringSort());//data String배열, MyStringSort 는 String타입 데이터 비교 구현되어 있어야 한다
		//[test, TEST, test123, TeSt123, 가나다]
		
		System.out.println(Arrays.toString(data));
		
		int [][]data2 = {{1,2,3},{4,5,6,7,8,9},{10,20,30}};
//		Arrays.sort(data2);//data2 이차배열	data2[0] int 1차배열 자연정렬x
		Arrays.sort(data2,new MyArraySort());
		
		for(int[] one : data2) {
			System.out.println(Arrays.toString(one));
		}
//		System.out.println(Arrays.toString(data2));
	}

}
