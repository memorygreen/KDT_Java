package day11;

public class PiggyBank {
	
	// 저금통 설계도 클래스
	
	//Class(설계도, 틀) -> 설계만 하는 것이라서 코드를 실행할 필요x ->main() 필요x
	
	// 필드
	// 자본 : money
	int money;
	
	// 메소드
	// 저금 : deposit, 출금 : withdraw, 잔액 : showMoney
	
	
	// 쌤 풀이2 - 자영 : 매개변수와 필드에있는 변수명 같을때?=>this(필드가리키는 변수 앞에 작성)(현재 이 메소드가 존재하는 클래스의 필드 가리킨다!)
	//저금하는 기능
	public void deposit(int money) {
		this.money += money;
	}
	
	//출금하는 기능
	public void withdraw(int money) {
		this.money -= money; //money 
	}
	
	//잔액을 보여주는 기능
	public void showMoney() {
		System.out.println("현재 잔액 : " + money);
	}
	
	
	
	
//	// 쌤 풀이1
//	//저금하는 기능
//	public void deposit(int input) {
//		money += input;
//	}
//	
//	//출금하는 기능
//	public void withdraw(int output) {
//		money -= output; //money 
//	}
//	
//	//잔액을 보여주는 기능
//	//자영 : 콘솔창에 출력하는 기능 내장
//	public void showMoney() {
//		System.out.println("현재 잔액 : " + money);
//	}
	
	
	// 자영풀이
	public void deposit2(int plus) {
		money = money + plus;
		System.out.println(plus + "원을 입금했습니다.");
	}
	
	public void withdraw2(int minus) {
		System.out.println(minus + "원을 출금했습니다.");
		this.money = this.money - minus;
	}
	
	public void showMoney2() {
		System.out.println("현재 잔액은 " + this.money + "원 입니다.");
	}
	
	
	
	
}
