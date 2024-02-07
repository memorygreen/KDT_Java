package Maple;

public class Thief extends BasicCharacter { //자:추상메소드 상속받는순간 추상클래스 안의 추상메소드를 구현(implements)해줘야함!!!
	//도적

	@Override
	public void attack() {
		System.out.println("럭키세븐!");
	}

	@Override
	public void avoid() {
		System.out.println("다크사이트!");
	}

	@Override
	public void move() {
		System.out.println("헤이스트!");
	}
	
}
