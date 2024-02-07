package javaFestival;

import java.util.Iterator;
import java.util.Random;

public class Ex21 {

	public static void main(String[] args) {

		// 아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때, 두 개의 숫자를 뽑아 서로의 거리를 비교한 후 거리가 가장 작은 숫자의
		// 위치(index)를 출력하시오.

		// 결과 :
		// result = [3, 5]
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 쌤풀이
		// * 두 수를 뽑아올 수 있어야함, 거리계산
		int index1 = 0; // 지금까지 계산한 거리 중에 제일 짧은 거리를 발견했을 때
						// 앞쪽에 있는 인덱스 번호 기억
		int index2 = 0; // 뒤쪽에 있는 인덱스 번호 기억

		int len = Math.abs(point[0] - point[1]);// 지금까지 본 거리 중에 제일 짧은 거리 기억

		// 거리(절댓값) 구하기

		// 쌤풀이

//		for (int j = 1; j <= 6; j++) {
//
//			if (Math.abs(point[0] - point[j]) < len) {
//				index1 = 0;
//				index2 = j;
//				len = Math.abs(point[0] - point[j]);
//			}
//		}
//		
//		
//		for (int j = 2; j <= 6; j++) {
//
//			if (Math.abs(point[1] - point[j]) < len) {
//				index1 = 1;
//				index2 = j;
//				len = Math.abs(point[1] - point[j]);
//			}
//		}
		
		
		//이중 for문
		
		for (int i = 0; i <  point.length - 1; i++) {
			// i=0 / j=1
			// i=1 / j=2
			// i=2 / j=3
			
			for (int j =i+1; j < point.length; j++) {//6

				if (Math.abs(point[i] - point[j]) < len) {
					index1 = i;
					index2 = j;
					len = Math.abs(point[i] - point[j]);
				}
			}
		}
		System.out.println("[" + index1 + "," + index2 + "]");
		
		
		//만약 MATH를 못 쓰는 경우
		for (int i = 0; i <  point.length - 1; i++) {
			// i=0 / j=1
			// i=1 / j=2
			// i=2 / j=3
			
			for (int j =i+1; j < point.length; j++) {//6
				
//				int big = (point[i] > point[j]) ? point[i] : point[j]; //둘 중 무조건 큰수 저장
//				int small = (point[i] > point[j]) ? point[j] : point[i];; //둘 중 무조건 작은수 저장
				//위두줄 대신 한줄로 가능!
				int temp = (point[i] > point[j]) ? point[i] - point[j] : point[j] - point[i];
				
				if (temp < len) {
					index1 = i;
					index2 = j;
					len = temp;
				}
			}
		}
		System.out.println("[" + index1 + "," + index2 + "]");
/********자영풀이************************************************************/
//		//0-1
//		if(Math.abs(point[0] - point[1]) < len) {
//			index1 = 0;
//			index2 = 1;
//			len = Math.abs(point[0] - point[1]);
//		};
//		
//		//0-2
//		if(Math.abs(point[0] - point[2]) < len) {
//			index1 = 0;
//			index2 = 2;
//			len = Math.abs(point[0] - point[2]);
//		};
//		//0-3
//		if(Math.abs(point[0] - point[3]) < len) {
//			index1 = 0;
//			index2 = 3;
//			len = Math.abs(point[0] - point[3]);
//		};
//		
//		//0-4
//		if(Math.abs(point[0] - point[4]) < len) {
//			index1 = 0;
//			index2 = 2;
//			len = Math.abs(point[0] - point[4]);
//		};
//		
//		//0-5
//		if(Math.abs(point[0] - point[5]) < len) {
//			index1 = 0;
//			index2 = 2;
//			len = Math.abs(point[0] - point[5]);
//		};
//		
//		//0-6
//		if(Math.abs(point[0] - point[6]) < len) {
//			index1 = 0;
//			index2 = 2;
//			len = Math.abs(point[0] - point[6]);
//		};

//		// 0번(vs 1~6) 인덱스 비교하기 for문
//		for(int j = 1 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 + 0] - point[j]) < len) {
//				index1 = 0 + 0;
//				index2 = j;
//				len = Math.abs(point[0 + 0] - point[j]);
//				System.out.println(len);
//			};
//		}
//		
//		
//		// 1번(vs 2~6) 인덱스 비교하기 for문
//		for(int j = 1 + 1 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 +1 ] - point[j]) < len) {
//				index1 = 0 +1 ;
//				index2 = j;
//				len = Math.abs(point[0 + 1] - point[j]);
//				System.out.println(len);
//			};
//		}
//		
//		// 2번(vs 3~6) 인덱스 비교하기 for문
//		for(int j = 1 + 2 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 +2 ] - point[j]) < len) {
//				index1 = 0 +2 ;
//				index2 = j;
//				len = Math.abs(point[0 + 2] - point[j]);
//				System.out.println(len);
//			};
//		}
//		
//		// 3번(vs 4~6) 인덱스 비교하기 for문
//		for(int j = 1 + 3 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 +3 ] - point[j]) < len) {
//				index1 = 0 +3 ;
//				index2 = j;
//				len = Math.abs(point[0 + 3] - point[j]);
//				System.out.println(len);
//			};
//		}
//		
//		// 4번(vs 5~6) 인덱스 비교하기 for문
//		for(int j = 1 + 4 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 + 4 ] - point[j]) < len) {
//				index1 = 0 +4 ;
//				index2 = j;
//				len = Math.abs(point[0 + 4] - point[j]);
//				System.out.println(len);
//			};
//		}
//		
//		// 5번(vs 6) 인덱스 비교하기 for문
//		for(int j = 1 + 5 ; j < point.length ; j++) {
//			
//			if(Math.abs(point[0 + 5 ] - point[j]) < len) {
//				index1 = 0 + 5 ;
//				index2 = j;
//				len = Math.abs(point[0 + 5] - point[j]);
//				System.out.println(len);
//			};
//		}

		// 자영 : 전체 for문 (중도포기...)
		for (int i = 0; i < point.length - 1; i++) {
			for (int j = 1 + i; j < point.length; j++) {

				if (Math.abs(point[i] - point[j]) < len) {
					index1 = i;
					index2 = j;
					len = Math.abs(point[i] - point[j]);
//					System.out.println(i + "번째 인덱스 vs " + j + "번째 인덱스");
//					System.out.println(len);
//					System.out.println(i + "번째 인덱스 : " + point[i]);
//					System.out.println(j + "번째 인덱스 : " + point[j]);
				}
			}
		}
//		System.out.println(len);
/****************************************************************************/
		// 힌트듣기

		// 0 vs 1 거리구하기
//		if(point[0] - point[1] < 0) {
//			min = (-1) + (point[0] - point[1]);
//			System.out.println(min);
//		
//		}else {
//			min = point[0] - point[1];
//			System.out.println(min);
//		}

//		Random ran = new Random();
//		
//		int num1 = ran.nextInt(7);
//		int num2 = ran.nextInt(7);
//		for(int i = 0; i < point.length ; i++) {	
//			System.out.println(point[num1]);
//			System.out.println(point[num1]);
//			
//		}
//		int min = 0;

//		//0 vs 1 거리구하기
//		if(point[0] - point[1] < 0) {
//			min = (-1) + (point[0] - point[1]);
//			System.out.println(min);
//		
//		}else {
//			min = point[0] - point[1];
//			System.out.println(min);
//		}

//		//0 vs 2
//		if(point[0] - point[1] < 0) {
//			min = (-1) + (point[0] - point[1]);
//			System.out.println(min);
//		
//		}else {
//			min = point[0] - point[1];
//			System.out.println(min);
//		}

		// 자영 시도중
//		for (int i = 0; i < point.length-1; i++) {
//			
//			for(int j = 0 ; j < point.length-1 ; j++) {
//				if(point[i] - point[j+i] < 0) {
//					min = (-1) + (point[i] - point[j+1]);
//					System.out.println(i + " 번 인덱스랑 " +(j+1) + " 인덱스랑 비교 : " + min);
//				
//				}else {
//					min = point[i] - point[j+1];
//					System.out.println(i + " 번 인덱스랑 " + (j+1) + " 번 인덱스랑 비교 : " + min);
//				}
//				
//				
//			}
//			
//		}

		// 거리비교 ->결과
		// 결과끼리 비교

	}

}
