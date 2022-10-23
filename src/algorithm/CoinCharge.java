package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class CoinCharge {

	static Stack<Integer> coinStack = new Stack();
	
	public static void main(String[] args) {
		//키보드 내가 낸 돈, 상품가격 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("내가낸돈 : ");
		int money = sc.nextInt();
		System.out.println("상품 가격 : ");
		int price = sc.nextInt();
		//잔돈 총액 계산
		int mymoney = money - price;
		System.out.println(mymoney);
		
		//잔돈 총액 charge(잔돈총액) 전달
		int[] coins = {10,50,100,300,500};//오름차순 정렬
		for(int i : coins) {
			coinStack.push(i);//5개
		}
		System.out.println("총동전갯수는= "+charge(mymoney,0));//동전갯수 0
	}
		//잔돈 총액 charge(잔돈총액) 전달
	static int charge(int mymoney,int count) {
		//stack pop - isEmpty사용
		int coinValue = coinStack.pop();
		int coinCount = mymoney / coinValue;//500,300,100 ... 동전 갯수
		int totalCount = coinCount + count;
		System.out.println(coinValue + " 원 동전은 "+ coinCount + " 개 받습니다.");
		if(mymoney ==0) {return totalCount;}
		return charge(mymoney % coinValue,totalCount);
			
			
	}

}
