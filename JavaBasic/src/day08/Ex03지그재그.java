package day08;

public class Ex03지그재그 {

	public static void main(String[] args) {

		// 아래와 같이 2차원 배열에 값을 넣고 출력하시오.
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		
		
		// 1hint... 행에 따라 들어가는 위치가 달라진다
		// 2hint.. 홀짝...
		// 3hint.. 행의 숫자가 홀짝에 따라 들어가는 순서가 달라진다
		
		// 0행 -> [0][0], [0][1], [0][2], [0][3], [0][4]
		// 1행 -> [1][0], [1][1], [1][2], [1][3], [1][4]
		// 2행 -> [2][0], [2][1], [2][2], [2][3], [2][4]
		// 3행 -> [3][0], [3][1], [3][2], [3][3], [3][4]
		// 4행 -> [4][0], [4][1], [4][2], [4][3], [4][4]
		
		
		//쌤 풀이
		int cnt = 1 ; 
		int array[][]= new int[5][5];
		
		//0행
//		array[0][0] = cnt;
//		cnt++;
//		array[0][1] = cnt;
//		cnt++;
//		array[0][2] = cnt;
//		cnt++;
//		array[0][3] = cnt;
//		cnt++;
//		array[0][4] = cnt;
//		cnt++;
		
		
//		//0행 -> for문
//		for(int j = 0 ; j < array[0].length ; j++) {
//			array[0][j] = cnt;
//			cnt++;
//		}
//		
//		//1행
//		array[1][4] = cnt;
//		cnt++;
//		array[1][3] = cnt;
//		cnt++;
//		array[1][2] = cnt;
//		cnt++;
//		array[1][1] = cnt;
//		cnt++;
//		array[1][0] = cnt;
//		cnt++;
//		
//		// 1행 -> for문
//		for(int j = array[1].length-1 ; j >= 0 ; j--) {
//			array[1][j] = cnt;
//			cnt++;
//		}
//		
//		
//		//2행 -> for문
//		for(int j = 0 ; j < array[2].length ; j++) {
//			array[2][j] = cnt;
//			cnt++;
//		}
//		
//		// 3행 -> for문
//		for(int j = array[3].length-1 ; j >= 0 ; j--) {
//			array[3][j] = cnt;
//			cnt++;
//		}	
//		
//		//4행 -> for문
//		for(int j = 0 ; j < array[4].length ; j++) {
//			array[4][j] = cnt;
//			cnt++;
//		}
		
		
		// 총 for문으로!!
		for( int i = 0 ; i < array.length ; i++) {
			if(i % 2 == 0) {
				
				for(int j = 0 ; j < array[i].length ; j++) {
					array[i][j] = cnt;
					cnt++;
				}
				
			}else { //i % 2 == 1
				
				for(int j = array[i].length-1 ; j >= 0 ; j--) {
					array[i][j] = cnt;
					cnt++;
					
				}	
				
				
			}
		}

		// 출력 -> 내가 가진 배열 순차적으로!!
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
				
			}System.out.println();
		}
		
		
		// 복습시간 - 심화
		System.out.println("for each문");
		//자영 : 2차원 배열을 foreach문으로 출력하려면 foreach문을 for문으로 감싸야하는걸까?
		for(int i = 0 ; i < array.length ; i++) {
			for(int num : array[i]) {
				System.out.print(num + " ");
			}System.out.println();
			
		}
			
		System.out.println("foreach문만 써보기");
		for(int num : array[2]) {
			System.out.print(num + " ");
		}System.out.println();
		
		
		System.out.println("구글링하고 이중 foreach써보기");
		for(int[] num1 : array) { //배열변수 num1을 선언해야한다!!! 행의 값이 담김
			
			for(int num2 : num1) { //한 행 num1의 각각 값을 num2로 담겠다는 뜻!!!!!
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		
		
		
		//자영풀이 
		
//		int array[][]= new int[5][5];
//		int cnt = 0;
//		for (int i = 0; i < array.length; i++) {
//
//			for (int j = 0; j < array[i].length; j++) {
//				if (i % 2 == 0) {
//					cnt++;
//					array[i][j] = cnt;
//				} else {
//					array[i][j] = cnt;
//					cnt--;
//				}
//				System.out.print(array[i][j] + "\t");
//			}
//
//			cnt = cnt + 5;
//			System.out.println();
//		}

	}

}
