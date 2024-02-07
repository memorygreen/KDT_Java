package day03;

public class Ex12Con {

	public static void main(String[] args) {

		// 다중 if문 
		
		int score = 100;
		if(score >= 90) {
			System.out.println("A");
			
		}else if(score >= 80) { //90미만이 실행되기 때문에 굳이 <90 쓰지 않아도 된다!!!
			System.out.println("B");
		}else {
			System.out.println("F");
		}
	}

}
