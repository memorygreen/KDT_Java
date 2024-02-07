package javaFestival;

public class Ex13_240122 {

	public static void main(String[] args) {
		// 13번 (2024.01.22. 14:10~14:15)
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] arr = score.split(",");
		
		
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;
		
		for(String a : arr) {
			
			if(a.equals("A")) {
				cntA++;
			}else if (a.equals("B")) {
				cntB++;
			}else if (a.equals("C")) {
				cntC++;
			}else if (a.equals("D")) {
				cntD++;
			}else if (a.equals("F")) {
				cntF++;
			}
			
		}
		
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
		
		

	}

}
