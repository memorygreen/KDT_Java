package javaFestival;

public class Ex23_240122 {

	public static void main(String[] args) {
		// 23번(2024.01.22. 18:55~19:00)
		
		int cnt = 1 ; 
		
		int [][] arr = new int[5][5];
		
		
		//입력
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = arr.length-1 ; j >=0 ; j-- ) {
				arr[j][i] = cnt;
				cnt++;
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}

}
