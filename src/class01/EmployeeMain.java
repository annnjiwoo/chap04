package class01;

public class EmployeeMain {
	public static void main(String[] args) {// start main
		System.out.println("==============================================");
		System.out.println("이름 \t 나이 \t 급여 \t 지역 \t 근무연수 \t 사원구분");
		System.out.println("name \tage \tsalary\t local \t terms \t gubun");
		System.out.println("-----------------------------------------------");
		
		//Employee type Array 선언 10칸짜리
		Employee[] emps = new Employee[10];
		
		// Raw Data로 각 배열에 객체를 생성해서 저장
	      emps[0] = new Employee("A", 28, 400, "KR", 10, "정규");
	      emps[1] = new Employee("B", 27, 600, "KR", 15, "정규");
	      emps[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
	      emps[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
	      emps[4] = new Employee("E", 23, 270, "RU", 1, "정규");
	      emps[5] = new Employee("F", 27, 390, "AM", 4, "정규");
	      emps[6] = new Employee("G", 31, 330, "SI", 3, "정규");
	      emps[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
	      emps[8] = new Employee("I", 38, 450, "FR", 10, "정규");
	      emps[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
		printEmployee(emps);
		System.out.println();

		// 2. 정규직 평균급여를 구해주는 메소드 생성(결과 반환=void)
		double avg = getSalAvg(emps);
		System.out.printf("2. 정규직 직원들의 평균 급여는 : %.2f", avg);
		System.out.println();
		System.out.println("2. 정규직 직원들의 평균 급여는 : "+ Math.round(avg*100)/100.0); // round는 정적필드 (객체 필요없음, static임)
		
		// 3. 한국 사원들의 평균 급여
		double kravg = getKrAvg(emps);
		System.out.println("3. 한국 직원들의 평균 급여는 : " + Math.round(kravg*100)/100.0);
		
	} // end main

	
	
	// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드 출력
	private static void printEmployee(Employee[] empsOut) {
		for (Employee employee : empsOut) {
			System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary() + "\t"
					+ employee.getLocal() + "\t" + employee.getTerms() + "\t" + employee.getGubun());
		}
	}

	
	// 2. 정규직 평균급여를 구해주는 메소드 출력(결과 반환)
	private static double getSalAvg(Employee[] emps) {
		int count = 0;
		int sum = 0;
		double salAvg = 0.0;
		for (Employee sal : emps) {
			if (sal.getGubun().equals("정규")) {
				sum += sal.getSalary();
				count++;
			}
		}
		salAvg = (double) sum / count;
		return salAvg;
	}
	
	// 3. 한국 사원들의 평균 급여 메소드 출력
	private static double getKrAvg(Employee[] emps) {
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		for (Employee kravg : emps) {
			if (kravg.getLocal().equals("KR")) {
				sum += kravg.getSalary();
				count++;
			}
		}
		avg = (double)sum / count;
		return avg;
	}
}



