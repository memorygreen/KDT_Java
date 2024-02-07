package day10;

public class selfStudy {

	public static void main(String[] args) {

		// 문제
		// 정수형 1차원 배열 array를 { 1, 3, 4, 8, 7, 9, 10}으로 초기화하고,
		// 이 array 배열을 매개변수로 받아 for문을 사용하여 배열의 전체 값 출력하는
		// arrayToString(int[] array)메소드 만들기
		
		int[] array =  { 1, 3, 4, 8, 7, 9, 10};
		arrayToString(array);
		
	}

	private static void arrayToString(int[] array) {
		for(int i = 0 ; i < array.length;i++) {
			
			System.out.print(array[i] + " ");
		}
	}
}
