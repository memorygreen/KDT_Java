package day05;

public class Ex01박수게임 {

	public static void main(String[] args) {

		//1부터 50까지 
		
		// 1Step. 1부터 50까지 반복문을 통해 숫자를 출력
		
		// 2Step. 1부터 50까지 숫자 중 일의자리만 출력
				//hint. 10을 활용
		
		//3Step. 일의 자리가 5이면 으악, 3,6,9이면 박수
		//		 나머지는 그냥 숫자 출력 (조건문)
		
		//선생님 풀이
		for(int i = 1; i<=50; i++) {
			int num = i % 10; //1의 자리수
			
			if(num == 5) {
				System.out.println("으악");
			}else if(num == 3 || num == 6 || num == 9) {
				System.out.println("박수");
			}else {
				System.out.println(i);
			}
		}
		
		//자영풀이
		for(int i = 1 ; i<=50 ; i++) {
			if(i%3==0) {	
			System.out.println("박수");
				
			}else if(i % 10 == 6) {
				System.out.println("박수");
			}else if(i % 10 == 9) {
				System.out.println("박수");
			}else if(i % 10 == 5) {
				System.out.println("으악");
			}else{
				System.out.println(i);
			}
		}
		
	}

}
