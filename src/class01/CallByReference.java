package class01;
/**
 * 메소드간 파라미트 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 *  - 콜바이 래퍼런스 CallByReference : 참조 주소값 복사
 */

public class CallByReference {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		printArray(numbers); // 배열 출력 메소드 호출, 괄호가 있으면 메소드 호출 + 값 전달
		printArray(a,b,c,d,e);// 같은 이름이 가능한 이유는 오버로딩이기 때문 
		// 이름은 같되, 타입-갯수-순서가 달라야함 (타입 : 배열 - int | 갯수 : 배열1개 - 갯수5개 | 순서 : 갯수부터 다르기때문에 순서 다름)
	}
	private static void printArray(int a, int b, int c, int d, int e) { // 괄호 안은 파라미터, 매개변수임
		// 해당 메소드 int a 는 int a = 0이 생성되고 (로컬변수), 위에 값을 받아옴
		// 기본형, 값을 하나만 주기때문에 하나씩 받아옴
		// 배열과 같은 값이 여러개인 경우는 참조형으로 받아옴
		System.out.println(a + " "+b + " "+ c+ " "+ d + " "+e);
		
	}
	// 배열을 전달 받아서 출력해주는 메소드
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 값은 하나만 보낼 수 있기때문에 배열을 받아옴,  numbers의 번지를 arr로 받아옴 (참조 자료형)
			System.out.println(arr[i]);
		}

	}

}
