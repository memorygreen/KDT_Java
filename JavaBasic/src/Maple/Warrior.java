package Maple;

public class Warrior extends BasicCharacter{

	//전사캐릭터
	
	@Override
	public void attack() {
		System.out.println("파워 슬래시!");
	}

	@Override
	public void avoid() {
		System.out.println("방패로 막기!");
	}

	@Override
	public void move() {
		System.out.println("빠른 걸음으로 이동!");
	}

	
}
