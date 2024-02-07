package day04;

public class Ex03Con {

	public static void main(String[] args) {

		// 4. switch ~ case
		// switch(값){
		// case 값1 : 실행문장
		// }
		
		int month = 13;
		
		//컴퓨팅 사고!!
		// 12, 1 ,2 -> 겨울 -> 0 (3으로 나눈 몫! 12제외)
		// 3, 4, 5 -> 봄 -> 1
		// 6, 7, 8 -> 여름 -> 2
		// 9, 10 ,11 -> 가을 -> 3
		
				
		switch(month) {
			case 1 : System.out.println("겨울"); break;
			case 2 : System.out.println("겨울"); break;
			case 3 : System.out.println("봄"); break;
			default : System.out.println("잘못 입력하셨습니다");//자영 : 모든 case 실행안될때 실행(마치 else절!)
			
		}

	}

}
