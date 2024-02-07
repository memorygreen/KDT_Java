package day05;

public class Ex04심화구구단 {

	public static void main(String[] args) {

	//1Step - 2단 반복문을 통해서 출력해보기
	
	//2Step - 2단 구구단을 복사 붙여넣기 해서 9단까지 해보기
		
	//3Step - 2단부터 9단까지 패턴을 찾아 반복문으로 처리하기

		//쌤 풀이
//		System.out.println(2 + "*" + 1+ "=" + 2 * 1);
//		System.out.println(2 + "*" + 2+ "=" + 2 * 2);
//		System.out.println(2 + "*" + 3+ "=" + 2 * 3);
//		System.out.println(2 + "*" + 4+ "=" + 2 * 4);
//		System.out.println(2 + "*" + 5+ "=" + 2 * 5);
//		System.out.println(2 + "*" + 6+ "=" + 2 * 6);
//		System.out.println(2 + "*" + 7+ "=" + 2 * 7);
//		System.out.println(2 + "*" + 8+ "=" + 2 * 8);
//		System.out.println(2 + "*" + 9+ "=" + 2 * 9);
	
		
		
		
//		System.out.println(2 + "단");
//		for (int j = 1; j <= 9 ; j++) {
//			System.out.println(2 + "*" + j + "=" + 2 * j);
//		}
//		
//		System.out.println(3 + "단");
//		for (int j = 1; j <= 9 ; j++) {
//			System.out.println(3 + "*" + j + "=" + 3 * j);
//		}
//		
//		System.out.println(4 + "단");
//		for (int j = 1; j <= 9 ; j++) {
//			System.out.println(4 + "*" + j + "=" + 4 * j);
//		}
//		
//		System.out.println(5 + "단");
//		for (int j = 1; j <= 9 ; j++) {
//			System.out.println(5 + "*" + j + "=" + 5 * j);
//		}
		
		
		for(int i = 2; i<=9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
		}
	}
		
		//자영 풀기
		//2단
		System.out.println("==2단==");
		for(int i = 1 ; i<=9 ; i++) {
			System.out.println("2*"+i+"="+2*i);
		}
		
		//단 반복
		for (int j =2 ; j<=9 ; j++) {
			
			System.out.println("==" +j + "단==");
		
			for(int i = 1 ; i<=9 ; i++) {
				System.out.println(j + "*" + i + "=" + j * i);
			}
		}
		
		//자영 풀기(거꾸로함)
//	for(int i = 1;i<=9;i++) {
//		
//		for(int j = 2 ; j<=9 ; j++) {
//			System.out.println("=="+j+"단==");
//			System.out.println(j+"*"+i+"="+j*i);
//		}
//	}
		

	}
}
