package class03;

public class SplitTestMain {
	public static void main(String[] args) {
		String csv = "홍길동;이규희;문소정;서규리;민중호";
		String[] arrTemp = csv.split(";");
		for (String st : arrTemp) {
			System.out.printf("%s",st);
		}
	}
	

}
