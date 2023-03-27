package class10;

import class02.Professor;
import class04.Student;
import class05.Department;
import class06.Takes;
import class10.vo.MakeData;

/**
 * 학사 행정 실행클래스
 * - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다. (학생정보+학과정보)
 */

public class SchoolManagementMain {
	public static void main(String[] args) {
		MakeData makedata = new MakeData();
		Student[] students = makedata.students;
		Department[] departments = makedata.departments;
		Takes[] takes = makedata.takes;
		Professor[] professors = makedata.professors;
		
		
		//[문제.1] 전체 학생 명단을 출력되 학생의 소속 학과를 함께 출력하시오
		printJoin(students, departments);
		
		//[문제.2] 전체 학생 명단을 출력되 학생의 과목코드와 성적을 함께 출력하시오
		printScore(takes,students);
		
		//[문제.3] 컴공 교수들을 모두조회
		printComputer(professors,departments );
	}

	private static void printComputer(Professor[] proArray, Department[] departments) {
		String computer = "컴퓨터공학과";
		int did = 0;	// 컴공의 Id 저장 (학과코드)
		for (Department department : departments) {
			if (department.getName().equals(computer)) {
				did = department.getId();
			}
		}
		for (Professor professors : proArray) {
			if (professors.getDepartment() == did) {
				System.out.println(professors.getId() + " " + professors.getName() + " " + professors.getJumin() + " "
						+ professors.getDepartment() + " " + professors.getGrade() + " " + professors.getHiredate()
						+ " " + computer);
			}
		}
	}
		
	
	//[문제.3] 컴공 교수들을 모두조회
	
	
	//[문제.2] 전체 학생 명단을 출력되 학생의 과목코드와 성적을 함께 출력하시오
	private static void printScore(Takes[] takes, Student[] students) {
		for (Takes take : takes) {
			for (Student student : students) {
				if (student.getId().equals(take.getId())) {
					System.out.printf("%s \t %s \t %s \t %d \t %s \t %d \t %s \t %s \n", student.getId(), student.getJumin(), 
							student.getName(), student.getYear(), student.getAddress(), 
							student.getDepartment(),take.getSubject(), take.getScore());
				}
			}
		}System.out.println();
		
	}
	
	//[문제.1] 전체 학생 명단을 출력되 학생의 소속 학과를 함께 출력하시오
	private static void printJoin(Student[] students, Department[] departments) {
		for (Department department : departments) {
			for (Student student : students) {
				if (student.getDepartment() == department.getId() ) {
					System.out.printf("%s \t %s \t %s \t %d \t %s \t %d \t %s\n", student.getId(), student.getJumin(), 
							student.getName(), student.getYear(), student.getAddress(), 
							student.getDepartment(),department.getName());
				}
			}
		}System.out.println();
		 
	}

}
