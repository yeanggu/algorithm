package algorithm;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("5!(반복문)="+fact1(5));
		System.out.println("5!(재귀호출)="+fact2(5));
	}
	
	static int fact1(int su) {
		int result = 1;
		for(int i=1;i<=su;i++) {
			System.out.println("==="+ su + "일 때 fact1 시작===");
			result = result * i;
		}
		System.out.println("==="+ su + "일 때 fact1 종료===");
		return result;
		
		
	}
	static int fact2(int su) {
		//su 변경하여 같은 메소드 계속 호출 - 무한 호출
		//종료 조건
		System.out.println("==="+ su + "일 때 fact2 시작===");
		if(su == 0 || su ==1) return 1;
		System.out.println("==="+ su + "일 때 fact2 종료===");
		return su * fact2(su-1);
	}
}
