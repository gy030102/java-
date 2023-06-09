package model;

public class Employee {

	private String name;

	private String id;

	private String gender;

	private String tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Employee(String id, String name, String gender, String tel) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.tel = tel;
	}

}
