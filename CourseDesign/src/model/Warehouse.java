package src.model;

public class Warehouse {
	
	private int number;
	
	private String name;
	//仓库容量
	private int capacity;
	
	private int principalId;
	
	private int phone;
	
	Warehouse(int number,String name,int capacity,int pricipalId,int phone){
		this.number =number;
		this.name = name;
		this.capacity= capacity;
		this.principalId = pricipalId;
		this.phone = phone;
	}
	

	public int getNumber() {
		return number; 
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

	public int getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(int principalId) {
		this.principalId = principalId;
	}
	
	
	

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
}
