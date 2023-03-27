package class05;

public class DepartmentData {
	// 필드
	public Department[] departments = new Department[3];
	
	public DepartmentData() {
		// 기본 생성자, 객체가 생성될 때 해당 데이터가 호출됨
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "208호");
	}
}
