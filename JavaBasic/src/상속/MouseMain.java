package 상속;

public class MouseMain {

	public static void main(String[] args) {

		//기본 마우스
		Mouse m= new Mouse();
		m.leftClick();
		m.rightClick();
		m.drag();
		
		System.out.println();
		//휠마우스
		WheelMouse wr = new WheelMouse();
		wr.scroll();
		
		//자영 : Mouse 클래스 상속받고 있음!
		wr.leftClick();
		wr.rightClick();
		wr.drag();
		
		System.out.println();
		// 피로감소 마우스
		ergonomicsMouse em = new ergonomicsMouse();
		em.destress();
		em.rightClick();
		em.leftClick();
		em.drag();
	}

}
