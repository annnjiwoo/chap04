package class07;

public class SampleMain {
	public static void main(String[] args) {
		String[] members = new String[3];
		members[0] = "1,홍길동";
		members[1] = "2,김철수";
		members[2] = "3,이영희";
		
		Sample[] samples = new Sample[3];
		for (int i = 0; i < samples.length; i++) {
			String[] sp = members[i].split(",");
			int tempId = Integer.parseInt(sp[0]);	// "1" > 1 문자열 전달 후 숫자로 변환 //Sample의 필드가 int, String이라 int형으로 만들어줘
			samples[i] = new Sample(tempId,sp[1]);
		}
		
		for (Sample sample : samples) {
			System.out.println(sample.getId() + " " + sample.getName());
		}
	}
	
	
		
	

}
