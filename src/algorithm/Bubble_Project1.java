package algorithm;

import java.util.Scanner;

public class Bubble_Project1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int students = sc.nextInt();
		
		int[] score = new int[students];
		
		for(int i=0;i<students;i++) {
			System.out.print("학생 "+(i+1)+" 점수 입력: ");
			score[i] = sc.nextInt();
		}
		
		bubble(score, score.length);
		
		for(int j=0;j<students;j++) {
			System.out.println((j+1)+"등 : "+score[j]);
		}
	}
	
	static void bubble(int[] a, int n) {
		System.out.println();
		System.out.println("성적 순으로 정렬");
		for(int i=0;i<n-1;i++) {//1번 인덱스에 2번째 작은 값 저장, 2번인덱스 3번째 작은값 저장, ...
			for(int j=0;j<n-i-1;j++) {//4개와 오른쪽 데이터 각각 비교 - 0번 인덱스에 가장 작은 값 저장
				if(a[j] < a[j+1]) {//2개 데이터 정렬
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}