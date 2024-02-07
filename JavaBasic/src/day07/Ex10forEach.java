package day07;

public class Ex10forEach {

	public static void main(String[] args) {

		
		String[] foods = {"광어", "우럭", "참치", "삼치", "수육", "족발", "곱창"};
		
		//기존 배열 안에 있는 값을 출력문으로 꺼내기
		for(int i = 0 ; i < foods.length ; i ++) {
			System.out.println(foods[i]);
		}
		
		// 확장배열 foreach (특정상황에서만 씀. 
		// 배열 안의 모든 인덱스에 접근할 때는 foreach를 사용하는 게 더 편리(자영 : 순차적으로 접근)
		// for( 배열안의 값을 담을변수 : 배열 ){}
		for( String food : foods ) {
			System.out.println(food);
		}
		
	}

}
