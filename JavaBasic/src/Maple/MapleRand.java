package Maple;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MapleRand {

	public static void main(String[] args) {
		// 캐릭터 - 도전, 전사, 마멉사, 궁수

//		Warrior w = new Warrior();
//		Thief t = new Thief();
//		Wizard m = new Wizard();
//		Archer a = new Archer();
		
		//쌤풀이2-1
//		BasicCharacter w = new Warrior();
//		BasicCharacter t = new Thief();
//		BasicCharacter m = new Wizard();
//		BasicCharacter a = new Archer();
		
//		ArrayList<BasicCharacter> list = new ArrayList<BasicCharacter>();
//		list.add(w);
//		list.add(t);
//		list.add(m);
//		list.add(a);
		
		//쌤풀이2-2(익명클래스)
		ArrayList<BasicCharacter> list = new ArrayList<BasicCharacter>();
		list.add(new Warrior()); //익명클래스 특1.Warrior 타입 객체가 BasicCharacter타입 객체로 자동 형변환돼서 들어옴(상속받아서가능) 특2. 객체의 이름이없다(변수x)
		list.add(new Thief());
		list.add(new Wizard());
		list.add(new Archer());
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 공격 2.회피 3. 이동 >>");
		int menu = sc.nextInt();
		// 문제.
		// 1번을 눌렀을 때에 위에 캐릭터 4개중 하나가 랜덤으로 나와서 공격을 하게 하세요.

		Random ran = new Random();

		//쌤풀이2-2
		if(menu == 1) {
			int p = ran.nextInt(list.size());
			list.get(p).attack();
//			list.get(ran.nextInt(list.size())).attack();//위 2줄 한줄로 처리가능
			
		}else if(menu == 2) {
			list.get(ran.nextInt(list.size())).avoid();//위 2줄 한줄로 처리가능
			
		}else if(menu == 3) {
			int p = ran.nextInt(list.size());
			list.get(ran.nextInt(list.size())).move();//위 2줄 한줄로 처리가능
			
		}
		
		
		//쌤풀이1(가장쉬운방법!단점 : 유지보수 어려움(캐릭터 늘어나면 일일이 수정필요)
//		if(menu == 1) {
//			
//			int p = ran.nextInt(4);
//			
//			if(p==0) {//전사공격
//				w.attack();
//			}else if(p==1) {
//				t.attack();
//			}else if(p==2) {
//				m.attack();
//			}else if(p==3) {
//				a.attack();
//			}
//		}
		
/*******************************************************/
		//자영풀이
		
		//자영풀이
//		BasicCharacter bw = new Warrior();
//		BasicCharacter bt = new Thief();
//		BasicCharacter bm = new Wizard();
//		BasicCharacter ba = new Archer();
//		ArrayList<BasicCharacter> listCharacter = new ArrayList<BasicCharacter>();
//		listCharacter.add(bw);
//		listCharacter.add(bt);
//		listCharacter.add(bm);
//		listCharacter.add(ba);
//		
//		int choose = ran.nextInt(listCharacter.size());
//		System.out.println(choose);// 확인용(랜덤숫자 뭔지)
//		
//		//자영풀이
//		if(menu == 1) {
//			listCharacter.get(choose).attack();
//
//		}
		//자영 다른 풀이(if문 밖에서 for문으로 풀어도 결과가 같은데?!)
//		for (int i = 0; i < listCharacter.size(); i++) {
//			if (choose == i) {
//				listCharacter.get(i).attack();
//			}
//		}

	}

}
