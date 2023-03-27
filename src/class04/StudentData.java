package class04;
/**
 * 데이터 저장 전담 클래스
 */
public class StudentData {
	// 필드 (데이터 저장 역할) / 기본형이 아닌 배열 타입 필드
	public Student[] students = new Student[8];	
	//public : 접근제한자
	//Student[] : 참조자료형(주소를 가지고 있음)

	public StudentData() {// 클래스 이름과 같음, 파라미터 없음 => 기본 생성자
		// 객체가 생성될 때 해당 데이터가 만들어짐
		students[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		students[1] = new Student("1292002", "900305-1730021", "김정현", 2, "서울", 20);
		students[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);		
		students[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		students[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		students[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		students[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		students[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);		
	}
}
