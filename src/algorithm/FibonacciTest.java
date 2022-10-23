package algorithm;

public class FibonacciTest {

	public static void main(String[] args) {
		//1 1 2 3 5 8 13 21 34 55
		int i1 = 1;
		int i2 = 1;
		System.out.println(1+" 항의 수열값은 = "+ i2);
		System.out.println(2+" 항의 수열값은 = "+ i1);
		for(int i=3;i<=6;i++) {
			int result = i2 + i1;
			//System.out.println(i+" 항의 수열값은= "+ result);
			i2 = i1;
			i1 = result;
			
		}
		
		System.out.println(6 + " 항의 수열값은 = "+fibo(6));
	}
	static int fibo(int su) {
		System.out.println("==="+su+" 일 때 fibo 시작===");
		if(su == 1 || su ==2) {return 1;}
		System.out.println("==="+su+" 일 때 fibo 종료===");
		return fibo(su-2)+fibo(su-1);
	}
}
