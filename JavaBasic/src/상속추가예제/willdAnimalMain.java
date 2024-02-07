package 상속추가예제;

public class willdAnimalMain {

	public static void main(String[] args) {

		WildAnimal w = new WildAnimal();
		w.hunt();
		
		Lion lion = new Lion();
		lion.hunt();
		lion.huntSolo();
		
		Eagle eagle = new Eagle();
		eagle.hunt();
		eagle.huntFly();
		
		Wolf wolf = new Wolf();
		wolf.huntGroup();
		wolf.hunt();
		
		
	}

}
