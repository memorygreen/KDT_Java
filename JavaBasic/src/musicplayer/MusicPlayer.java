package musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	public static void main(String[] args) {

		// 뮤직플레이어

		// 노래정보 - 가수(Sting), 제목(String), 시간초(int)
		// 자영 : 내가 원하는 데이터타입 필요하면 만들어라->"클래스=데이터타입"!!!!!!!!!!

		// 노래객체 하나 생성해보기
		// 객체 = 레퍼런스 변수
		// 데이터타입 변수명 = new 데이터타입();
		// 자영 : 기본형데이터타입 변수명 = 값;
//		Music m1 = new Music();//객체 = 레퍼런스변수(데이터타입)= {singer, title, time}저장할수있는공간 만듦
		// 에러남

		
		
//		Music m1 = new Music("뉴진스", "OMG", 183);
//		// 자영 : 생성자 통해 데이터 넣어야만 생성되는 강제성 생김->데이터 누락될 일이 없음
//		Music m2 = new Music("아이유", "금요일에 만나요", 170);
//		Music m3 = new Music("박재정", "헤어지자말해요", 181);
//		Music m4 = new Music("DK(디셈버)", "심", 190);
//		Music m5 = new Music("황치열", "그대가내안에박혔다", 199);

		// 노래재생 추가
		Music m1 = new Music("Anne Marie", "2002", 180, "C:\\music_v2\\Anne Marie - 2002.mp3");
		Music m2 = new Music("Billie Eilish", " bad guy", 180, "C:\\music_v2\\Billie Eilish - bad guy.mp3");
		Music m3 = new Music("Carmen Twillie, Lebo M.", " Circle of Life", 180, "C:\\music_v2\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		Music m4 = new Music("CHUNG HA", " 벌써 12시", 180, "C:\\music_v2\\CHUNG HA - 벌써 12시.mp3");
		Music m5 = new Music("Idina Menzel", "Let It Go", 180, "C:\\music_v2\\Idina Menzel - Let It Go.mp3");
		Music m6 = new Music("Itzy", "Dalla Dalla", 180, "C:\\music_v2\\Itzy - Dalla Dalla.mp3");
		Music m7 = new Music("JENNIE", "SOLO", 180, "C:\\music_v2\\JENNIE - SOLO.mp3");
		Music m8 = new Music("Mena Massoud, Naomi Scott", "A Whole New World", 180, "C:\\music_v2\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		Music m9 = new Music("Rain", "깡", 180, "C:\\music_v2\\Rain - 깡.mp3");
		Music m10 = new Music("SHINee", "Ring Ding Dong", 180, "C:\\music_v2\\SHINee - Ring Ding Dong.mp3");
		Music m11 = new Music("TWICE", "FANCY", 180, "C:\\music_v2\\TWICE - FANCY.mp3");
		Music m12 = new Music("이하이", "NO ONE", 180, "C:\\music_v2\\이하이 - NO ONE.mp3");

		
		
//		m1.singer = "뉴진스"; //자영 : 막을 수 있는 방법이없음
//		m1.title = "OMG";
//		m1.time = 182; //-5000 써도 들어감...제한이 없어... 

//		//자영 : 우회해서 값 넣기 set(), 우회해서 값 가져오기 get()
//		m1.setSinger("뉴진스"); //자영 : singer ->private 직접 필드에 접근 불가 =>setter 메소드로 !! //보안프로그램 가능
//		m1.setTitle("OMG");
//		m1.setTime(182);
//		// 자영 : 생성자 만들었기 때문에 이제 사용할 필요X =>값이 변할때 사용!

//		System.out.println(m1.singer);
//		System.out.println(m1.time);
//		System.out.println(m1.title);
		// (자영 : 여기까지가 객체를 설계해서 객체 생성한 것)

		System.out.println(m1.getSinger());// 뉴진스
		System.out.println(m1.getTitle());// OMG
		System.out.println(m1.getTime());// 182

		// 객체지향 특징 4가지(캡상추다)
		// 캡슐화 (못들음 ㅠ)
		// 상속 (못들음 ㅠ)
		// 추상화 =>자영 : 공통적인 특징
		// 다형성 => 어떤 클래스 들어오느냐에 따라 다양한 기능 나타난다

		// 노래정보를 ArrayList에 저장
		ArrayList<Music> list = new ArrayList<Music>(); // 자영 : <> : 제네릭기법. 어떤 데이터타입으로 할지 명시하지 않음. //Music객체(타입)만 저장할 수
														// 있는 공간 만들었다!!!

		
		
//		list.add(m1);
//		list.add(m2);
//		list.add(m3);
//		list.add(m4);
//		list.add(m5);

		// 노래 추가
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);
		list.add(m10);
		list.add(m11);
		list.add(m12);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//자영 : 4번힌트(현재 위치를 알고 있을 변수)
		int point = 4; // 현재 노래 위치저장변수(자영 : 현재 위치가 있어야 다음이 있고 이전이 있다!
		
		
		// mp3 파일을 실행해주는 객체0 //노래 실행
		MP3Player mp3 = new MP3Player();
//		mp3.play("C:\\music_v2\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		
		
		
		while (true) {

			System.out.print("1.목록 2.재생 3.이전곡 4.다음곡 5.종료 >>");
			int menu = sc.nextInt();
			
			//1.목록
			if (menu == 1) {
				System.out.println("=========♨노ㄹH list ♨========");
				//ex. 1. 뉴진스 - OMG (183초)
				
				
				//쌤풀이
//				System.out.println(list.get(0)); //주소 //list.get(0) = Music개체 하나!
				System.out.print(list.get(0).getSinger() + "-");
				System.out.print(list.get(0).getTitle() + "(");
				System.out.println(list.get(0).getTime() + "초)");
				
				//for문으로
				for(int i = 0 ; i < list.size() ; i ++) {
					
					System.out.print(i+1 + "." + list.get(i).getSinger() + "-");
					System.out.print(list.get(i).getTitle() + "(");
					System.out.println(list.get(i).getTime() + "초)");
					
				}
				
				
				//자영풀이
//				for(int i = 0 ; i < list.size(); i++) {
//					
//					System.out.printf("%d. %s - %s (%d초)",i+1, list.get(i).getSinger(), list.get(0).getTitle() ,list.get(i).getTime());
//					System.out.println();
//				}
					
//				System.out.println(list.get(0).getTitle());
//				System.out.println(list.get(1).getTitle());
//				System.out.println(list.get(2).getTitle());
//				System.out.println(list.get(3).getTitle());
//				System.out.println(list.get(4).getTitle());

				//2. 재생
			} else if (menu == 2) {
				System.out.println("======재생======");
				System.out.print(point+1 + "." + list.get(point).getSinger() + "-");
				System.out.print(list.get(point).getTitle() + "(");
				System.out.println(list.get(point).getTime() + "초2)");
				
				// 노래 추가
//				mp3.play(list.get(point).getPath());//자영 : 해당 포인트 위치 가져와서 getPath해서 path(경로) 가져옴!
				
				if(mp3.isPlaying()) { //자영 : 노래 실행중이면 true반환
					mp3.stop();
				}
				
				mp3.play(list.get(point).getPath());
				
				//3. 이전곡
			} else if (menu == 3) {
				
				//쌤풀이
				if(point > 0) {
					point--;
					System.out.print(point+1 + "." + list.get(point).getSinger() + "-");
					System.out.print(list.get(point).getTitle() + "(");
					System.out.println(list.get(point).getTime() + "초)");
					
				}else {
					System.out.println("이전곡이 없습니다");
					
				}
				
				// 노래 추가
				if(mp3.isPlaying()) { //자영 : 노래 실행중이면 true반환
					mp3.stop();
				}
				
				mp3.play(list.get(point).getPath());//자영 : 어차피 포인트 올라갔으니 재생만 하면 됨
				
				
				
				// 자영 풀이
//				if(point > 0 && point < list.size()) {
//					point--;
//					System.out.print(point+1 + "." + list.get(point).getSinger() + "-");
//					System.out.print(list.get(point).getTitle() + "(");
//					System.out.println(list.get(point).getTime() + "초)");
//					
//				}else {
//					System.out.println("이전곡이 없습니다");
//					
//				}
				
				// 4. 다음곡
			} else if (menu == 4) {
				
				// ex. 2. 아이유 - 금요일에 만나요 (173초)
				// 마지막곡에서 다음 누를 때는 다음곡이 없습니다 출력!
				
				//쌤풀이
				if(point < list.size() - 1) { //마지막인덱스 = 길이-1 //인덱스4일때는 증가x //인덱스 3일때까지만 증가
					point ++; 
						System.out.print(point+1 + "." + list.get(point).getSinger() + "-");
						System.out.print(list.get(point).getTitle() + "(");
						System.out.println(list.get(point).getTime() + "초)");
						
				}else {
					System.out.println("다음곡이 없습니다");
					
				}
				
				//노래 실행중이면 멈추고 다음곡 재생하도록!!
				if(mp3.isPlaying()) { //자영 : 노래 실행중이면 true반환
					mp3.stop();
				}
				
				mp3.play(list.get(point).getPath());
				
				
				//현빈씨 도움받기 // 모르겠다~~~~~
//				System.out.printf("%d. %s - %s (%d초)\n",point+2, list.get(point+1).getSinger(), list.get(point+1).getTitle(),  list.get(point+1).getTime());
//				if(point > 3) {
//					point = 0;
//					System.out.println("다음곡이 없습니다");
//				}
				
//				for(int i = 1)
				
//				for(int i = point ;  i ;i++) {
//					System.out.println("2. 아이유 - 금요일에 만나요 (173초)",list.get(point+1).getTitle());
//					
//				}
//				System.out.println(list.get(point+1).getTitle());
//				System.out.println(list.get(0+1).getTitle());
//				System.out.println(list.get(0+2).getTitle());
//				System.out.println(list.get(0+3).getTitle());
//				System.out.println(list.get(0+4).getTitle());
//				"다음곡이 없습니다."
				
				
				
				// 5. 종료
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다...");
				
				//자영 : 노래 재생중이면 멈추도록!!
				if(mp3.isPlaying()) { //자영 : 노래 실행중이면 true반환
					mp3.stop();
				}
				
				
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");

			}

		}

	}

}
