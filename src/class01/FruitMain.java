package class01;
/**
 * 실행클래스
 */

public class FruitMain {
	public static void main(String[] args) {
		
		//객체 한개 생성
		Fruit peach = new Fruit();
		// new : 객체생성
		// Fruit() : 필드 초기화
		// Fruit peach : 클래스 Fruit 타입의 peach변수 생성
		
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);
		
		printFruit(peach); // printFruit 메소드 호출
		
		//객체 여러개 생성
		Fruit apple = new Fruit("사과", 2000, 5);
		Fruit mango = new Fruit("망고", 1000, 2);
		Fruit banana = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000, 1);
		Fruit orange = new Fruit("오렌지", 6000, 4);
		
		//과일 객체 5개를 전달 후 받아서 출력하는 메소드를 만드세요
		printFruit(apple, mango, banana, pineapple , orange); // printFruit 메소드 호출
		
		//과일 객체 5개 담을 수 있는 Array 선언
		Fruit [] fruit1 = new Fruit[5];
		//선언한 배열에 위에 만든 과일 객체 담기
		fruit1[0] =  apple;
		fruit1[1] =  mango;
		fruit1[2] =  banana;
		fruit1[3] =  pineapple;
		fruit1[4] =  orange;
		
		// 배열 받아온 메소드 응답
		printFruit(fruit1);
	}

	// 배열 받아온 메소드 응답
	private static void printFruit(Fruit[] fruit1) {
		for (int i = 0; i < fruit1.length; i++) {
			System.out.println(fruit1[i].getName() + " " + fruit1[i].getPrice() + " " + fruit1[i].getQuantity());
		}
		System.out.println();
		for (Fruit fruit : fruit1) {
			System.out.println(fruit.getName() + " " + fruit.getPrice() + " " + fruit.getQuantity());
		}
	}
	//과일 객체 5개를 전달 후 받아서 출력하는 메소드
	private static void printFruit(Fruit apple, Fruit mango, Fruit banana, Fruit pineapple, Fruit orange) {
		// printFruit1 메소드 응답
		System.out.println(apple.getName() + " " + apple.getPrice() + " " + apple.getQuantity());
		System.out.println(mango.getName() + " " + mango.getPrice() + " " + mango.getQuantity());
		System.out.println(banana.getName() + " " + banana.getPrice() + " " + banana.getQuantity());
		System.out.println(pineapple.getName() + " " + pineapple.getPrice() + " " + pineapple.getQuantity());
		System.out.println(orange.getName() + " " + orange.getPrice() + " " + orange.getQuantity());
		System.out.println();

	}

	private static void printFruit(Fruit pea) {
		// printFruit 메소드 응답
		// 파라미터는 세팅한 값의 타입(클래스)이 동일해야함 / "Fruit" peach = new Fruit();
		System.out.println(pea.getName());
		System.out.println(pea.getPrice());
		System.out.println(pea.getQuantity());
		System.out.println();
	}

}
