package day07;

import java.util.Scanner;

public class Ex06팀원찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] team = { "강민지", "김자영", "김현빈", "이대길", "이다은" };

		System.out.print("팀원 이름을 입력해주세요 >> ");
		String name = sc.next();

		// 문제
		// 입력) 김자영
		// 결과) 김자영은 2번째 위치에 존재합니다.

		// 입력) 이대길
		// 결과) 이대길은 4번째 위치에 존재합니다.

		// 쌤풀이

		// 비교해서 출력하기
//		if(team[0].equals(name)) {
//			System.out.println( 0+1 + "번째에 존재합니다.");
//		}
//		
//		if(team[1].equals(name)) {
//			System.out.println( 1+1 + "번째에 존재합니다.");
//		}
//		
//		if(team[2].equals(name)) {
//			System.out.println( 2+1 + "번째에 존재합니다.");
//		}
//		
//		if(team[3].equals(name)) {
//			System.out.println( 3+1 + "번째에 존재합니다.");
//		}
//		
//		if(team[4].equals(name)) {
//			System.out.println( 4+1 + "번째에 존재합니다.");
//		}

		// =>패턴 존재 =>for문

//		for (int i = 0; i < team.length; i++) {
//			if (team[i].equals(name)) {
//				System.out.println(i + 1 + "번째에 존재합니다.");
//				break; // 자:해당 팀원 찾으면 다음에 또 찾을 필요없다!=>좀더 효율적인 코드
//			}
//		}

		// 심화문제
		// 입력) 손흥민
		// 결과) 손흥민은 존재하지 않습니다. (한번)
		// 쌤 풀이1

//		boolean isCheck = true; // 멤버 판별 변수
//
//		for (int i = 0; i < team.length; i++) {
//			if (team[i].equals(name)) {
//				System.out.println(i + 1 + "번째에 존재합니다.");
//				isCheck = false; // if문 안에서 인원 1번이라도 찾으면 false로 바뀜 (사람을 찾은거다)
//				break; // 자:해당 팀원 찾으면 다음에 또 찾을 필요없다!=>좀더 효율적인 코드
////				isCheck = !isCheck; //같은 문장. 개발자들이 많이 씀 리터럴 상수 피하는 경향
//			}
//		}
//		
//		if (isCheck) {// isCheck가 true면 사람을 못 찾은거다
//			System.out.println("해당 멤버는 존재하지 않습니다");
//		}
		
		//쌤풀이1-2 (isCheck 반대로)
		boolean isCheck = false; // 멤버 판별 변수

		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.println(i + 1 + "번째에 존재합니다.");
				isCheck = true; // if문 안에서 인원 1번이라도 찾으면 false로 바뀜 (사람을 찾은거다)
				break; // 자:해당 팀원 찾으면 다음에 또 찾을 필요없다!=>좀더 효율적인 코드
//				isCheck = !isCheck; //같은 문장. 개발자들이 많이 씀 리터럴 상수 피하는 경향
			}
		}
		
		if (!isCheck) {// isCheck가 true면 사람을 못 찾은거다
			System.out.println("해당 멤버는 존재하지 않습니다");
		}
		
		
		
		//쌤풀이2
		// 마지막 if문 도달해도 없으면? ->못찾은것
		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.println(i + 1 + "번째에 존재합니다.");
				break; // 자:해당 팀원 찾으면 다음에 또 찾을 필요없다!=>좀더 효율적인 코드
//				isCheck = !isCheck; //같은 문장. 개발자들이 많이 씀 리터럴 상수 피하는 경향
			}else if (i == team.length - 1 ){//길이-1 = 마지막 인덱스
				System.out.println("해당 멤버가 존재하지 않습니다");
			}//있다면 위에 break에서 걸렸겠지!!!
		}
		
		
		//쌤풀이 1-3(질문)
		boolean isCheck2 = false; // 멤버 판별 변수

		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.println(i + 1 + "번째에 존재합니다.");
//				isCheck = true; // if문 안에서 인원 1번이라도 찾으면 false로 바뀜 (사람을 찾은거다)
				isCheck2 = !isCheck2; //!false->true
				break; 
			}
		}
		
		if (!isCheck2) {// isCheck가 true면 사람을 못 찾은거다
			System.out.println("해당 멤버는 존재하지 않습니다");
		}
		
		
		
		// 자영풀이
//		for (int i = 0; i < team.length; i++) {
//			if (name.equals(team[i])) { // (x) 자영 : 문자열 비교는 .equals로!!!
//				System.out.println(team[i] + "은 " + (i + 1) + "번째 위치에 존재합니다.");
//			}
//		}
//			if(name == team[]) {
//				System.out.println(team[i]+ "은 " + (i+1) + "번째 위치에 존재합니다.");
//			}else {
//				System.out.println("오류");
//			}
//		}

		// 심화문제
		// 입력) 손흥민
		// 결과) 손흥민은 존재하지 않습니다. (한번)

		// 자영 풀이
//		for (int i = 0; i < team.length; i++) {
//			if (name.equals(team[i])) {
//
//			}
//		}
//		System.out.println(name + "은 존재하지 않습니다.");//(x)for문 안에 넣으면 계속 반복이되고 , 밖에 넣으면 무조건 출력되고...

	}
}
