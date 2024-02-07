package day08;

public class Ex01이차원배열 {

	public static void main(String[] args) {

		// 이차원 배열
		// - 배열 안에 배열이 존재하는 배열
		
		//			   0  1  2  3
		// array -> 0 [1, 2, 3, 4]
		// 			1 [5, 6, 7, 8]
		// 			2 [9 ,10,11,12]
		
		int[][] array = new int[3][4];
		
		int cnt = 1 ;//이차원 배열안에 저장될 값
		
//		// 0행
//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
//		array[0][2] = cnt;
//		cnt++;
//		array[0][3] = cnt;
//		cnt++;
//		
//		// 1행
//		array[1][0] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//		array[1][2] = cnt;
//		cnt++;
//		array[1][3] = cnt;
//		cnt++;	
//		
//		// 2행
//		array[2][0] = cnt;
//		cnt++;
//		array[2][1] = cnt;
//		cnt++;
//		array[2][2] = cnt;
//		cnt++;
//		array[2][3] = cnt;
//		cnt++;	
		
		
		
		
//		System.out.println(array.length); //3
//		System.out.println(array[2].length); //4
		
		// for문(패턴 존재!)
		
		//쌤풀이
		
		//열에 값넣기 (열의 길이 : 4, 인덱스는 0부터 시작 =>열의 길이보다 작을 때까지! array[0]도 배열이다! array[0].length)
		//0행
//		for (int j = 0; j < array[0].length ; j++) {//array[0].length == 4
//			array[0][j] = cnt;
//			cnt++;
//		}
//		
//		//1행
//		for (int j = 0; j < array[1].length ; j++) {
//			array[1][j] = cnt;
//			cnt++;
//		}
//		
//		//2행
//		for (int j = 0; j < array[2].length ; j++) {
//			array[2][j] = cnt;
//			cnt++;
//		}
		
		// 행=> for문
		for (int i = 0 ; i < array.length ; i++) {//array.length == 3 
			for (int j = 0; j < array[i].length ; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}
		
		// 출력=>for문
		for (int i = 0 ; i < array.length ; i++) {//array.length == 3 
			for (int j = 0; j < array[i].length ; j++) {
//				System.out.print(array[i][j] + " ");
				System.out.print(array[i][j] + "\t");
			}System.out.println(); //한 번 출력 끝나면(작은 for문) 줄바꿈
		}
		
		
		// 자영풀이
		cnt = 0;
		for( int i = 0 ; i < array.length ; i++) {
			for( int j = 0 ; j < array[i].length ; j++) {
				cnt++;
				array[i][j] = cnt;
			}			
		}
		
		
		
		/////////////////////출력파트////////////////////////////
//		//0행 출력
//		System.out.print(array[0][0] + " ");
//		System.out.print(array[0][1] + " ");
//		System.out.print(array[0][2] + " ");
//		System.out.print(array[0][3] + " ");
//		System.out.println();
//		
//		//1행 출력
//		System.out.print(array[1][0] + " ");
//		System.out.print(array[1][1] + " ");
//		System.out.print(array[1][2] + " ");
//		System.out.print(array[1][3] + " ");
//		System.out.println();
//		
//		//2행 출력
//		System.out.print(array[2][0] + " ");
//		System.out.print(array[2][1] + " ");
//		System.out.print(array[2][2] + " ");
//		System.out.print(array[2][3] + " ");
//		System.out.println();

		//for문으로 출력
		// 자영
		for( int i = 0 ; i < array.length ; i++) {
			for( int j = 0 ; j < array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
			}System.out.println();
		}
		
		
	}

}
