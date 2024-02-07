package day11;

public class PiggyBankMain {

	public static void main(String[] args) {

		
		//저금통 설계도 클래스를 불러와서 돈을 저금하고 인출하고 잔액을 볼 수 있는 클래스
		// Object(객체, 결과물) -> 실제 결과물을 만들 것이라서 실행할 main() 필요
		
		//쌤풀이
		PiggyBank pig = new PiggyBank();
		//자영)PiggyBank():pig라는 하나의 객체를 만들 때 쓰는 생성자 메서도
		//자영)현재 설계도 클래스에는 없으니 기본생성자 메서드는 내장되어있음
		//자영)만약 또다른 생성자를 만들면 자동 내장된 기본생상자 PiggyBank()는 사라지게됨 
		
		// 1500, 700 저금
		pig.deposit(1500); //(자영 : 1500원 저금
		pig.deposit(700);//자영:700원 저금
		// (자영 : 접근제한자 확인->매개변수 확인->{} 실행)
		
		// 현재 잔액 보기
		pig.showMoney();
		
		// 500원 출금
		pig.withdraw(500);
		
		// 현재 잔액 보기
		pig.showMoney();
		
		//자영 풀이
		PiggyBank pig2 = new PiggyBank();
		
		System.out.println("자영 풀이");
		pig2.money = 0;
		
		pig2.deposit2(1500);
		pig2.deposit2(700);
		pig2.showMoney2();
		pig2.withdraw2(500);
		pig2.showMoney2();
		
	}

}
