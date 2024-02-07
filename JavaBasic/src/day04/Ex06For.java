package day04;

public class Ex06For {

	public static void main(String[] args) {

		//구단을 외자
		//2단 출력
		
		// printf : print format
		// (자영 : DB에서 "" 는 format!)
		// 정수 : %d(decimal)
		// 엔터(개행) : %n (new)
		// 실수 : %f (floating)
		// 문자열 : %s (String)
		
		// 안녕하세요 저는 나예호입니다. 나이는 21살입니다.
		String name = "나예호";
		int age = 21;
		System.out.println("안녕하세요 저는 " + name + "입니다. 나이는 " + age + "살입니다.");
		
		System.out.printf("안녕하세요 저는 %s입니다. 나이는 %d살입니다.%n", name, age);
		
		System.out.printf("오늘 비가 올 확률은 %.2f입니다. %n", 30.5234);
		
		
//		System.out.println();
//		System.out.println("2 x 1 = 2");
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6");
//		System.out.println("2 x 4 = 8");
//		System.out.println("2 x 5 = 10");
//		System.out.println("2 x 6 = 12");
//		System.out.println("2 x 7 = 14");
//		System.out.println("2 x 8 = 16");
//		System.out.println("2 x 9 = 18");
		
//		System.out.println();
//		System.out.printf("2 x %d = %d%n", 1, 2);
//		System.out.printf("2 x %d = %d%n", 2, 4);
//		System.out.printf("2 x %d = %d%n", 3, 6);
//		System.out.printf("2 x %d = %d%n", 4, 8);
//		System.out.printf("2 x %d = %d%n", 5, 10);
//		System.out.printf("2 x %d = %d%n", 6, 12);
//		System.out.printf("2 x %d = %d%n", 7, 14);
//		System.out.printf("2 x %d = %d%n", 8, 16);
//		System.out.printf("2 x %d = %d%n", 9, 18);
		
//		System.out.println();
//		System.out.printf("2 x %d = %d%n", 1, 2*1);
//		System.out.printf("2 x %d = %d%n", 2, 2*2);
//		System.out.printf("2 x %d = %d%n", 3, 2*3);
//		System.out.printf("2 x %d = %d%n", 4, 2*4);
//		System.out.printf("2 x %d = %d%n", 5, 2*5);
//		System.out.printf("2 x %d = %d%n", 6, 2*6);
//		System.out.printf("2 x %d = %d%n", 7, 2*7);
//		System.out.printf("2 x %d = %d%n", 8, 2*8);
//		System.out.printf("2 x %d = %d%n", 9, 2*9);
		
//		System.out.println();
//		System.out.printf("2 x %d = %d%n", i, 2*i);
		
		for(int i =1;i <= 9;i++) {
			System.out.printf("2 x %d = %d%n", i, 2*i);
		}
		
	}

}
