package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> team = new ArrayList<>(); // (x)자영 아직 문법을 못 외웠다~~
		// 기본데이터 타입 아니면? 객체타입이면? ->검은생 대문자로 시작

		// 자영 : 값 저장(for문 사용)
		for (int i = 0; i < 5; i++) {// (x) 자영 : team.size() 처음에는 0 이라서 안 된다!
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			team.add(name);// (x) 값 추가할 때는 add!
		}

		System.out.print("자영팀의 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " "); // (x) 값 가져올때는 get!
		}
		System.out.println(" 입니다.");

		// 팀원 퇴출시키기
		// 1. 퇴출할 팀원 이름 입력
		System.out.print("퇴출시킬 팀원 : ");
		String getOut = sc.next();
		// 2. team ArrayList의 0 ~ 마지막 인덱스를 검사한 후
		// 내가 입력한 팀원이 있으면 삭제 후 다시 팀원 출력

		// 쌤풀이

		System.out.print("남은 팀원은 ");
		for (int i = 0; i < team.size(); i++) {

			if (team.get(i).equals(getOut)) {
				team.remove(i); // team.remove(getOut);
				break;
			}
		}
		
		//출력
		System.out.print("자영팀 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");

		// 자영풀이
		team.remove(getOut);
		
		
		System.out.print("남은 팀원은 ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " "); // (x) 값 가져올때는 get!
		}
		System.out.println("입니다.");
	}

}
