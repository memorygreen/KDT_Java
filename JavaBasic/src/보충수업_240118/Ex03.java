package 보충수업_240118;

public class Ex03 {

	public static void main(String[] args) {
		// 자바페스티벌 13번

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// 특정 기호 기준으로 잘라서 배열로 만들어줌
		String[] splitResult = score.split(",");

		// for each문으로 출력
		for (String s : splitResult) {
			System.out.println(s);
		}
		
		//쌤풀이 //
		System.out.println("switch문");
		int A = 0, B = 0, C=0, D=0, F=0;
		
		for (String s : splitResult) {
			switch(s) {
			case "A" : A++; break;
			case "B" : B++; break;
			case "C" : C++; break;
			case "D" : D++; break;
			case "F" : F++; break;
			}
			
		}
		
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");
		
		System.out.println("for문");
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;
		
		for (int i = 0; i < splitResult.length; i++) {
			if (splitResult[i].equals("A")) {
				cntA++;
			} else if (splitResult[i].equals("B")) {
				cntB++;
			} else if (splitResult[i].equals("C")) {
				cntC++;
			} else if (splitResult[i].equals("D")) {
				cntD++;
			} else if (splitResult[i].equals("F")) {
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
