package class05;

public class Department {
	private int id;
	private String name;
	private String office;

	// 기본생성자
	public Department() {
	}

	// 오버로딩생성자
	public Department(int id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

}