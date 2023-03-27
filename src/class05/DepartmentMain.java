package class05;

public class DepartmentMain {
	public static void main(String[] args) {
		// DepartmentData 객체의 주소가 dd 로 저장
		DepartmentData dd = new DepartmentData();
		// DepartmentData 객체의 필드를 가지고옴
		Department[] departments = dd.departments;

		// 기초데이터 생성
		//initData(departments);
		// [문제.1] 학과 목록을 출력하시오
		printDepartment(departments);
		// [문제.2] 학과 고트 (id) 가 923인 학과코드+네임+오피스 출력
		getDepartment(departments);
		// [문제.3] 컴공의 교실을 조회해서 main에서 출력
		getOffice(departments);
		String com = getOffice(departments); //getOffice의 리턴값의 타입과 동일하게 String 변수설정
		System.out.println("컴공의 교실은? " + com);
	}

	// 기초데이터 생성
	private static void initData(Department[] departments) {// 한개의 값만 들어갈 수 있어서 배열의 주소를 넣어줌
		departments[0] = new Department(920, "컴퓨터공학과", "201호");// 부서객체 생성해서 담고있음
		departments[1] = new Department(923, "산업공학과", "207호");
		departments[2] = new Department(925, "전자공학과", "208호");
	}
	// [문제.1] 학과 목록을 출력하시오
	private static void printDepartment(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department.getId() + " " + department.getName() + " " + department.getOffice());
		}
	}
	// [문제.2] 학과 코드 (id)가 "923"인 학과코드+네임+오피스 출력
	private static void getDepartment(Department[] departments) {
		for (Department department : departments) {
			if (department.getId() == 925) {
				System.out.printf("학과 코드 (id)가 %s인 학과는? : %s %s %s", department.getId(), department.getId(),
						department.getName(), department.getOffice());
			}
		}
		System.out.println();
	}
	// [문제.3] 컴공의 교실을 조회해서 main에서 출력
	private static String getOffice(Department[] departments) {// private static String getOffice = 나가는게 String 이다.
		String tempOffice = "";
		for (Department department : departments) {
			if (department.getName().equals("컴퓨터공학과")) {
				tempOffice += department.getOffice();
			}
		}
		return tempOffice;
	}

}
