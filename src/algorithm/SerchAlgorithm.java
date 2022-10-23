package algorithm;

public class SerchAlgorithm {

	public static void main(String[] args) {
		int[] data = {6,4,3,2,1,5,8};
		//중앙값 == 찾을값 찾았다
		//정렬상태 가정
		int[] data2 = {1,2,3,4,5,6,8};
		int target =3;
		int pl = 0;
		int pr = data2.length-1;
		
		while(true) {
		//중앙위치 찾아라
		int pc = (pl+pr)/2;
		if(target ==data2[pc]) {
			System.out.println("data2["+ pc +"]에서"+target + "찾음");
		}else if(target>data2[pc]) {
			pl = pc+1; //검색 시작위치를 중앙위치 다음 인덱스로 변경(마지막 위치 무변)
		}else if(target<data2[pc]) {
			pr = pc-1; //검색 시작위치를 중앙위치 이전 인덱스로 변경(시작 위치 무변)
		}
		if(pl>pr) {
			System.out.println("못찾음");
			break;
		}
		}
	}

}

//선형검색으로 3찾기
//main 메소드 안
//int target = 10;
//for(int i=0;i<data.length;i++) {//i=7 종료
//	System.out.println(i+"번째 반복중");
//	for(target == data[i]) {
//		System.out.println("data["+i+"]에서"+target+" 찾았다");
//		break;
//	}
//}
//if(i==data.length) {
//	System.out.println(target + " 못찾았다");