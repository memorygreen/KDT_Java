package day07;

public class Ex02큰수찾기 {

	public static void main(String[] args) {

		// 길이가 5인 정수형 배열 array 만들기
		int array[] = new int[5];
		
		array[0] = 12;
		array[1] = 3;
		array[2] = 9;
		array[3] = 15;
		array[4] = 7;
		
		// array 배열 안에서 가장 큰 수를 찾아 출력하시오
		// 결과) 가장 큰 수 : 15
		// 자영 : key point : 가장 큰 수 저장할 변수 필요 
		
		//쌤풀이
		
		
		//패턴 찾기
		int max = 0;
		if(max < array[0]) {
			max = array[0];
		}
		
		if(max < array[1]) {
			max = array[1];
		}
		
		if(max < array[2]) {
			max = array[2];
		}
		
		if(max < array[3]) {
			max = array[3];
		}
		
		if(max < array[4]) {
			max = array[4];
		}
		
		
		//for문
		for(int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}System.out.println("가장 큰 수 : " + max);
		
		
		
//		// 자영 풀이
//		
//		int max = array[0];
//		
//		for(int i = 0 ; i < array.length ; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		}System.out.println("가장 큰 수 : " + max);
//		
//		// 자영 푸는 중
//		// 패턴 찾기
//		if(array[0] > array[1]) {
//			max = array[0];
//		}else {
//			max = array[1];
//		}
//		
//		if(array[1] > array[2]) {
//			max = array[1];
//		}else {
//			max = array[2];
//		}
//		
//		if(array[2] > array[3]) {
//			max = array[2];
//		}else {
//			max = array[3];
//		}
//		
//		if(array[3] > array[4]) {
//			max = array[3];
//		}else {
//			max = array[4];
//		}
//		
////		System.out.println(max);
	}

}
