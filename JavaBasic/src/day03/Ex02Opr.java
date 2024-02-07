package day03;

public class Ex02Opr {

	public static void main(String[] args) {
		// 3. 증감연산자 (증가, 감소)
		// 단항연산자
		
		int num = 10;
		
		// num에 1을 더하라
		// num에 1을 더한 값을 다시 num에 대입
		num++; 
		System.out.println(num); //11
		
		num--;
		System.out.println(num); //10
		
		++num;
		System.out.println(num); //11

		--num;
		System.out.println(num); //10
		
		// 현재 num : 10
		System.out.println(num++);//10(o)
		System.out.println(num++);//11
		
		// num++
		// 먼저 num을 호출, 호출된 이후에 1을 더하자
		// (대게는 이것 사용)
		
		// ++num
		// 1을 더한 이후에 num을 호출
		
		
		
	}

}
