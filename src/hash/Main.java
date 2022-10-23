package hash;

public class Main {

	public static void main(String[] args) {
		ChainHash<Integer,String> ch = new ChainHash<Integer,String> (13);
		int result = ch.add(1, "삼성컴퓨터");//1%13 => 1
		System.out.println(result);
		result = ch.add(2, "LG노트북");
		System.out.println(result);
		result = ch.add(3, "APPLE맥북");
		System.out.println(result);
		
		result = ch.add(3, "삼성맥북");//데이터 수정 변경
		System.out.println(result);
		
		result = ch.add(14, "삼성프린터");//4%13 => 1,next<= table[1] 0리턴
		System.out.println(result);
		result = ch.add(27, "캐논프린터");
		System.out.println(result);
		
		ch.remove(14);
		ch.dump();
		
		System.out.println(ch.search(14));
		System.out.println(ch.search(1));
	}

}
