package class02;

/**
 * 
 */
public class ProfessorMain {

	public static void main(String[] args) {
		Professor[] proArray = new Professor[6];
		proArray[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		proArray[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		proArray[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		proArray[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		proArray[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		proArray[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		// 교수들의 목록을 출력해주는 메소드를 만드세요.
		printProfessor(proArray); // 메소드 호출

		// 910 학과 교수중 입사년도가 2005년인 교수는?(2조건)
		getHireDate2005(proArray); // 메소드 호출
		
		//주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		//새로 입사한 선명규 교수를 그 자리에 저장하세요.
		//(빈 객체 생성 후 setter 메소드로 값저장)
		//"96031", "790208-1884203" ,"선명규", 920, " 부교수", "2021"
		getNewPro(proArray); // 메소드 호출

	} // end main

	// 교수 목록 출력 메소드
	// 메소드 출력
	private static void printProfessor(Professor[] proArray) {
		for (Professor professor : proArray) {
			System.out.println(professor.getId() + " " + professor.getName() + " " + professor.getJumin() + " "
					+ professor.getDepartment() + " " + professor.getGrade() + " " + professor.getHiredate());
		}
		System.out.println();
	}

	// 910 학과 교수중 입사년도가 2005년인 교수는?(2조건)
	// 메소드 출력
	private static void getHireDate2005(Professor[] proArray) {
		for (Professor professor : proArray) {
			if (professor.getDepartment() == 910 && professor.getHiredate().contains("2005")) {
				System.out.println("910 학과 교수중 입사년도가 2005년인 교수는? " + professor.getName());
			}
		}
		System.out.println();
	}

	// 새로 입사한 선명규 교수를 그 자리에 저장하세요.
	// 메소드 출력
	private static void getNewPro(Professor[] proArray) {// (Professor[] proArray > 매개변수)
		// (빈 객체 생성 후 setter 메소드로 값저장)
		Professor newArray = new Professor("96031", "790208-1884203", "선명규", 920, " 부교수", "2021");

		for (int i = 0; i < proArray.length; i++) { // proArray에서 Professor 객체를 꺼내 professor에 넣음
			if (proArray[i].getJumin().equals("590327-1839240") && proArray[i].getName().contains("이태규")) {
				proArray[i] = newArray;
			}
		}
		// 교수출력 메소드 재호출
		printProfessor(proArray);

	}
}