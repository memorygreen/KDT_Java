package Maple;

//자:추상클래스
public abstract  class BasicCharacter {
	// 기본 캐릭터
	// 체력, 마력, 경험치, 공격, 회피, 이동
	int hp;
	int mp;
	int exp;
	
	//자:추상메소드
	public abstract void attack();
	
	public abstract void avoid();
	
	public abstract void move();
	
}
