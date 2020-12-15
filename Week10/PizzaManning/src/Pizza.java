
public class Pizza extends MenuItem {
	//Erica Manning
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	public Pizza(String topping, String size, double price) {
		setTopping(topping);
		setSize(size);
		setPrice(price);
		
		if (getSize() == null) {
			throw new IllegalArgumentException("Pizza was not created");
		}
		
		nextOrderNumber++;
		orderNumber = nextOrderNumber;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") || size.equalsIgnoreCase("extra large") ) {
			this.size = size.toLowerCase();
		}
		else {
			this.size = null;
		} 
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String repeatOrder() {
		String size = this.getSize();
		String topping = this.getTopping();
		double price = this.getPrice();
		int orderNumber = this.getOrderNumber();
		
		return super.getDescription() + "Pizza Info: Order Number: " + orderNumber + ", Size: " + size + ", Topping: " + topping + ", Price: $" + price;
	}

	
}
