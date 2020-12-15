
public class Bicycle {
	private int height;
	public String model;
	private int wheels;
	
	public Bicycle(){
		this.height = 28;
		this.model = "Capital";
		this.wheels = 2;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
