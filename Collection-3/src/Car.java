
public class Car {
	private String brand;
	private int price;
	private String model;
	private String color;
	private boolean isAvailable;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	
	public void setCOlor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable=isAvailable;
	}
	public boolean getisAvailable() {
		return isAvailable;
	}
	
	public Car(String brand, int price, String model, String color, boolean isAvailable) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
		this.isAvailable=isAvailable;
	}
	
	public String toString() {
		return "Branb:"+brand+",Price:"+price+",Model:"+model+",Color:"+color+",IsAvailable:"+isAvailable;
	}
	
	
	
	
	

}
