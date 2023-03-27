package class01;
/**
 * 과일클래스
 * 필드(멤버변수, 인스턴스 변수)
 *  - String name
 *  - int price
 *  - int quantity
 */

public class Fruit {
	//필드 (멤버변수, 인스턴스 변수)
	private String name;
	private int price;
	private int quantity;
	
	// 기본생성자
	public Fruit() {	
	}
	
	//오버로딩 생성자  (타개순 달라야함)
	public Fruit(String name,int price, int quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	

}
