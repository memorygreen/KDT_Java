package Maple;

public class Wizard extends BasicCharacter{

	//마법사
	@Override
	public void attack() {
		System.out.println("매직클로!");
	}

	@Override
	public void avoid() {
		System.out.println("매직쉴드!");
		
	}

	@Override
	public void move() {
		System.out.println("텔레포트!");
		
	}
	
	
	
	
}
