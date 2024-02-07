package 추상;

import java.util.ArrayList;

public class Restaurant {

	public static void main(String[] args) {
		
		
		// 원조 박병관 짜장면집
		//자 : 객체 생성(변수 생성).
//		Pbkjjajang pbk = new Pbkjjajang(); // 자 : 클래스명(데이터타입 ) 변수명 = new 생성자(); //자 : 추상클래스는 객체 생성 불가능함(에러남)
		
		// 자 : 생성자 == 클래스명과 동일 , 리턴타입 없음, 객체호출
		
//		pbk.makeJjajang(); //출력 : 짜장소스 위에 완두콩과 얇게 채썬 오이가 듬뿍 들어간추가로 계란후라이까지(반숙) 있는 짜장면~ //자 : 추상클래스는 객체 생성 불가능함(에러남)
//		pbk.makeJjambong(); //자 : 박병관(아빠)는 자식 메서드 못함!

//		// 첫째아들 박종우 짜장면집
//		PJWjjajang pjw = new PJWjjajang();
//		pjw.makeJjajang(); // 자 : 오버라이딩 ->출력 : 파인애플이 잔뜩 올라간 짜장면
//		pjw.makeJjambong(); //자: 박병관(아빠)는 못함!
//		
//		// 둘째딸 박자영 짜장면집 (서울)
//		PJYjjajang pjy = new PJYjjajang();
//		pjy.makeJjajang(); // 자 : 오버라이딩 -> 출력 : 민트가 잔뜩올라간 짜장면
//		
//		// 셋째아들 박대길 짜장면집 (제주도)
//		PDGjjajang pdg = new PDGjjajang();
//		pdg.makeJjajang();
		
		
		//(어렵) (자 : 각자 나갔다가 부모 가게로 돌아오는 것)
		
		// 업캐스팅 - 자식클래스에서 객체가 생성되었으나
		//	 		부모클래스타입으로 형태가 변환된 것
		// 부모 타입으로 형태가 변환되어도 부모의 메소드를 호출할 때 
		//자식 클래스에서 재정의 했다면 자식클래스의 재정의한 메소드가 호출된다.
		
		// 다운 캐스팅 - 부모타입객체가 자식타입으로 변환하는 것
		
		// 첫째아들 박종우 짜장면집
		//자:업캐스팅
		Pbkjjajang pjw = new PJWjjajang();
		
		//자:다운캐스팅
		PJWjjajang newPJW =(PJWjjajang) pjw; //자 : 부모타입에 있던 박종우짜장이 다시 박종우 짜장으로 갈거ㅏ
		//에러 : 부모타입이 자식타입으로 들어가고 싶다면 무조건 강제로 명시해줘야함(규칙)
		newPJW.makeJjambong();//출력 : 신선한 해물(안익음)이 잔뜩 올라간 해물짬뽕!

		
		
		// 둘째딸 박자영 짜장면집 (서울)
		Pbkjjajang pjy = new PJYjjajang();
		
		// 셋째아들 박대길 짜장면집 (제주도)
		Pbkjjajang pdg = new PDGjjajang();
		
		ArrayList<Pbkjjajang> list = new ArrayList<Pbkjjajang>(); //자 : 같은 데이터타입만 들어갈 수 있음(???)
		
		list.add(pjw);
		list.add(pjy);
		list.add(pdg);
		
//		// 자:다형성(기능 달리시행)
//		list.get(0).makeJjajang(); //파인애플이 잔뜩 올라간 짜장면
//		list.get(1).makeJjajang(); //민트가 잔뜩올라간 짜장면
		
	}

}
