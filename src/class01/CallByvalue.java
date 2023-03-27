package class01;

/**
 * 메소드간 파라미터 전달 - 콜바이 밸류(Call by value)
 * 배열이나 객체는 값이 여러개
 */

public class CallByvalue {
	public static void main(String[] args) {

		int num1 = 5; // 값을 그냥 저장하는 기본형
		int num2 = 10;

		int sum = addNumbers(num1, num2); // 다른 메소드 호출

		System.out.println("정수 " + num1 + " 더하기  " + num2 + "은 " + sum);
	}

	// 덧셈 메소드, 콜바이 밸류(Call by value) 라고 함
	private static int addNumbers(int num1, int num2) { // 여기서 int는 위에 int와 다른 값, 이름만 같음
		int result = num1 + num2;
		return result;
	}
}
