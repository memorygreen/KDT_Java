package Maple;

public class Archer extends BasicCharacter {

	@Override
	public void attack() {
		System.out.println("더블 애로우");
	}

	@Override
	public void avoid() {
		System.out.println("나무위로 도망치기");
	}

	@Override
	public void move() {
		System.out.println("달리다!");

	}

}
