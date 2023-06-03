package src.model;

public class Goods {

	private int number;
	private String name;
	//库存量
	private int stocks;
	private int warehouseID;
	private String firm;
	private double inPrice;
	
	
	 Goods(int Number,String name,int stocks,int warehouseId,String firm,double inPrice) {
		this.number =Number;
		this.name =name;
		this.firm=firm;
		this.stocks = stocks;
		this.warehouseID = warehouseID;
		this.inPrice = inPrice;
	}
	
	 Goods(){}
	
	
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
	
	
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	
	
	
	public int getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(int warehouseID) {
		this.warehouseID = warehouseID;
	}
	
	
	
	public String getFirm() {
		return firm;
	}
	public void setFirm(String firm) {
		this.firm = firm;
	}
	
	
	
	public double getInPrice() {
		return inPrice;
	}
	public void setInPrice(double inPrice) {
		this.inPrice = inPrice;
	}
	
	
	
	

	
	
	
}
