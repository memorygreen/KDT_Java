package 인터페이스;

public class Pika implements Digimon, Pokemon {//자:인터페이스는 다중상속가능(어떤 걸 상속받든 메소드 구현안된게 똑같음
	
	// interface 상속받는 키워드 ->implements
	// 상속(extends) -> 클래스 간의 부모-자식 관계 ->공통되는 필드나 메소드를 추상화하는 개념
	// 구현(implements) ->다중상속가능(자:디부분x 매개변수x 메소드이름 같음) ->형제 관계(자:클래스의 다양성을 높인다)->클래스를 확장시켜 다향성을 높임
	
	
	@Override
	public void attack() {//자:인터페이스 상속받을 때에는 implement (상속받으면 무조건 구현해야함)
		System.out.println("피카츄가 공격한다~!~!");
	}

	@Override
	public void specialAttack() {
		System.out.println("피카츄 백만볼트~~~!!");
	} 
	
	
	

}
