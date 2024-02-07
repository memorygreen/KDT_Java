package day05;

public class Ex06심화구구단3 {

	public static void main(String[] args) {
		// 1Step - 첫번째 줄만 반복문을 사용하지 않고 출력해보기
		// 2Step - 첫번째 줄을 반복문으로 처리햅괴
		// 3Step - 아홉줄을 반복문 안 하고 출력해보기
		// 4Step - 패턴을 찾아 반복문으로 처리 

		
		// 선생님 풀이
		//step1
//		System.out.print(2 + "*" + 1 + "=" + 2 * 1 + "\t"); //tab간격으로 띄우겠다!
//		System.out.print(3 + "*" + 1 + "=" + 3 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(4 + "*" + 1 + "=" + 4 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(5 + "*" + 1 + "=" + 5 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(6 + "*" + 1 + "=" + 6 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(7 + "*" + 1 + "=" + 7 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(8 + "*" + 1 + "=" + 8 * 1 + "\t"); //tab간격으로 띄우겠다!!
//		System.out.print(9 + "*" + 1 + "=" + 9 * 1 + "\t"); //tab간격으로 띄우겠다!!
		
		//step2
//		for(int j = 2 ; j <= 9 ; j++) {
//			System.out.print(j + "*" + 1 + "=" + j * 1 + "\t"); 
//		} 
//		System.out.println();
//		
//		for(int j = 2 ; j <= 9 ; j++) {
//			System.out.print(j + "*" + 2 + "=" + j * 2 + "\t"); 
//		} 
//		System.out.println();
//		
//		for(int j = 2 ; j <= 9 ; j++) {
//			System.out.print(j + "*" + 3 + "=" + j * 3 + "\t"); 
//		} 
//		System.out.println();
		
		//stpe4
		for(int i = 1 ; i <= 9; i++) {
			for(int j = 2 ; j <= 9 ; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t"); 
			} 
			System.out.println(); 
		}
		
		// 자영 혼자 풀어보기2
		
		//step1
//		System.out.print(2+"*"+1+"="+2*1+" ");
//		System.out.print(3+"*"+1+"="+3*1+" ");
//		System.out.print(4+"*"+1+"="+4*1+" ");
//		System.out.print(5+"*"+1+"="+5*1+" ");
//		System.out.print(6+"*"+1+"="+6*1+" ");
//		System.out.print(7+"*"+1+"="+7*1+" ");
//		System.out.print(8+"*"+1+"="+8*1+" ");
//		System.out.print(9+"*"+1+"="+9*1+" ");
//		System.out.println();
		
		//step2
//		for(int j = 2 ; j<=9 ;j++) {
//			System.out.print(j+"*"+1+"="+j*1+" ");
//			
//		}System.out.println();
		
		//step3
//		for(int j = 2 ; j<=9 ;j++) {
//			System.out.print(j+"*"+1+"="+j*1+" ");
//			
//		}System.out.println();		
//		
//		for(int j = 2 ; j<=9 ;j++) {
//			System.out.print(j+"*"+2+"="+j*2+" ");
//			
//		}System.out.println();		
//		
//		for(int j = 2 ; j<=9 ;j++) {
//			System.out.print(j+"*"+3+"="+j*3+" ");
//			
//		}System.out.println();
		
		
//		// step4
//		for(int i = 1;i<=9;i++) {
//
//			for(int j = 2 ; j<=9 ;j++) {
//				System.out.print(j+"*"+i+"="+j*i+" ");
//				
//			}System.out.println();
//				
//		}
//		
//		//자영풀이1
//		for(int i = 1;i<=9; i++) {
//			for(int j = 2;j<=9;j++) {
//				System.out.print(j + "*" + i + "=" + j * i + " ");
//			}System.out.println();
//		}
		
	}

}
