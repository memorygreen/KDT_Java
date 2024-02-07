package day02;

public class Ex04Type {

	public static void main(String[] args) {

		// 3. 정수형(Integer Type)
		// 1) byte
		// 키워드 : byte
		// 크기 : 1byte (8bit) = 256가지 정보표현
		// 범위 : -128 ~ 0 ~ +127
		
		byte age = 21;
		//byte age2 = 200; //에러
		
		
		// 2) short 
		// 키워드 : short
		// 크기 : 2byte (16bit)
		// 범위 : -32,768 ~ +32,767
		
		short lunchMenuPrice = 7500;
		
		// 3) int (정수 - 기본 데이터타입)
		// 키워드 : int
		// 크기 : 4byte (32bit)
		// 범위 : -21억 ~ + 21억
		
		int lottoWinningAmount = 1_631_432_063; //_ 삽입가능(맨 앞, 맨 뒤 불가)
		
		
		// 4) long
		// 키워드 : long
		// 크기 : 8byte (64bit)
		// 범위 : -900경 ~ +900경
		
//		long globalPopular = 8_000_000_000; //에러->int 범위 넘어감
		long globalPopular = 8_000_000_000L; //L(소문자 헷갈, 대문자쓰는 편)
		
		
		
	}

}
