package day12;

public class Contact {
	
		
	private String name; //자영 : 접근제한자 public생략  //private : 같은 클래스에서만 접근 가능
	private int age;	
	private String tel;

	// getter 메소드
	// 자영 : 필드의 값을 가져올 수 있게 해주는 메소드
	
	public String getName() { //자영 : 다른 클래스에서 name 필드 바로 접근 못하니, 다른 클래스에서 getName 호출한 후 ->name 이라는 필드값 리턴. 같은 클래스니까 가져올 수 o
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTel() {
		return tel;
	}
	
	//생성자 메소드
	//자영 : 생성자(자동완성)
	public Contact(String name, int age, String tel) {
		super();
		this.name = name; //자영 : 구별 위해 this
		this.age = age;
		this.tel = tel;
	}

	

	
	
	
}
