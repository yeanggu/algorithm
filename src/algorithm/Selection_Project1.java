package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int students = sc.nextInt();
		
		int[] score = new int[students];
		
		for(int i=0;i<students;i++) {
			System.out.print("학생 "+(i+1)+" 점수 입력: ");
			score[i] = sc.nextInt();
		}
		
		Selection(score, score.length);
		
		for(int j=0;j<students;j++) {
			System.out.println((j+1)+"등 : "+score[j]);
		}
		
		
	}
	
	static void Selection(int[] a, int n) {
		System.out.println();
		System.out.println("성적 순으로 정렬");
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
	}
}

