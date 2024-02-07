package day08;

public class Ex06비정방형배열 {

	public static void main(String[] args) {

		// 1 2
		// 3 4 5 
		// 6 7 8 9
		
		// 행 개수 알지만 열 개수 다름
		
		int[][] array = new int[3][]; //3행인 것만 안다 //빈공간만 만들어줌(행만)
//		int[] a;
//		int[] b;
//		int[] c;

		
		//생성
		//int[] a = new int[3];

		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[4];
		
		int cnt = 1;
		
		//0행 값 넣기
//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
//		
//		//1행 값 넣기
//		array[1][0] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//		array[1][2] = cnt;
//		cnt++;
//		//2행 
//		array[2][0] = cnt;
//		cnt++;
//		array[2][1] = cnt;
//		cnt++;
//		array[2][2] = cnt;
//		cnt++;
//		array[2][3] = cnt;
//		cnt++;
		
		//for문으로 값 입력하기
//		//0행 -> for문으로 값 넣기
//		for(int j = 0 ; j < array[0].length; j++) {
//			array[0][j] = cnt;
//			cnt++;
//		}
//		
//		//1행 -> for문으로 값 넣기
//		for(int j = 0 ; j < array[1].length; j++) {
//			array[1][j] = cnt;
//			cnt++;
//		}
//		
//		//2행 -> for문으로 값 넣기
//		for(int j = 0 ; j < array[2].length; j++) {
//			array[2][j] = cnt;
//			cnt++;
//		}
		
		
		//for문으로 묶기 //비정방형배열도 똑같다! 코드가 알아서 열의 개수만큼 접근하니까 알아서 입력됨!
		for(int i = 0; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
			}
		}

		for(int i = 0; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}System.out.println();
		}
	}

}
