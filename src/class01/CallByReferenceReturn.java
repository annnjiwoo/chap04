package class01;
/**
 * 메소드간 파라미터 전달 (배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 *  - 콜바이 래퍼런스 : 참조 주소값 복사
 */

public class CallByReferenceReturn {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		//// 전달받은 배열의 요소에 10을 더해주는 메소드

		int[] newNumber = addTen(numbers); // 메소드 호출하고 반환된 값을 받음
		//numbers는 지역변수이자 배열변수
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		for (int i = 0; i < newNumber.length; i++) {
			System.out.println("새로운 배열 " + newNumber[i]);
		}
		
		
		// for (int i = 0; i < newNembers.length; i++) {
		// System.out.println(newNembers[i]);
		// }
	}

	private static int[]  addTen(int[] arr) {
		// 메소드 내 파라미터의 이름은 달라도됨, 타입은 같아야함
		
		int[] numArr = null ; // 배열은 0이나 1로 초기화 불가, null로 가능하나 메모리공간 확보 안됨
		numArr = new int [arr.length];	// 5칸짜리 새로운 배열 만들어짐
		
		for (int i = 0; i < arr.length; i++) {
			numArr[i] += arr[i] + 10;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 10;
		}
		return numArr;	// 값 반환

	}

}
