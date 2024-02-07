package day02;

public class Ex01Var {

	public static void main(String[] args) {
		
		//GC(Garbage Collector)
		//사용되지 않는 변수 등을 알아서 정리
		
		// 변수의 선언(Declare)
		int box; // 정수형 변수 box를 사용할거야
		//int box; //에러(지역 변수 중복)
		
		//syso + 자동완성(Ctrl + Space)
		//System.out.println(box); //에러(지역변수 초기화되지x)
		
		// 변수의 할당(Assignment)
		box = 3; //최초 할당-> 초기화
		box = 100; //재할당
		
		int box2 = 10; //선언과 동시에 초기화
		
	}

}
