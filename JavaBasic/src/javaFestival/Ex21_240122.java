package javaFestival;

public class Ex21_240122 {

	public static void main(String[] args) {
		// 21번(2024.01.22. 17:52~18:03)
		int[] point = {92, 32, 52, 9, 81, 2, 68}; //0~6
		
		 //기준이 되는 거리
		int num = (point[0] - point[1]) > 0 ? (point[0] - point[1]) : (-1)*(point[0] - point[1]);
		
		
		//인덱스 위치 기억할 변수
		int index1= 0;
		int index2= 0;
		
		// 0~6 각각 비교해서 가장 적은 거리 담기
		
		for(int i = 0 ; i < point.length; i++) {
			
			for (int j = i+1; j < point.length; j++) {
				int len = (point[i] - point[j]) > 0 ? (point[i] - point[j]) : (-1)*(point[i] - point[j]) ;
				
				if(len < num) {
					
				index1= i;
				index2 = j;
				
				num = len;
				}
				
			}
		}System.out.println("result = [" + index1 + ", " + index2 + "]");
		
		
//		0 1
//		0 2
//		0 3
//		0 4
//		0 5
//		
//		1 2 
//		1 3 
//		1 4 
//		1 5
//		
//		2 3
//		2 4 
//		2 5
//		
//		3 4
//		3 5
//		
//		4 5

	}

}
