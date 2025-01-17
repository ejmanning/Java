//Erica Manning
import java.text.DecimalFormat;

public class Blanket {
	private String size;
	private String color;
	private String material;
	protected double price = 25;
	
	
	public Blanket() {
		this.size = "twin";
		this.color = "blue";
		this.material = "wool";
	}
	
	public Blanket(String size, String color, String material) {
		setSize(size);
		setColor(color);
		setMaterial(material);

	}
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
		
		if (size.equals("twin")) {
			
		} else if (size.equals("queen")) {
			price += 25;
		} else if (size.equals("king")) {
			price += 40;
		} else {
			throw new IllegalArgumentException("Not a valid size. The valid sizes are twin, queen, or king.");
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
		
		if(material.equals("wool")) {
			price += 20;
		} else if(material.equals("chenille")) {
			price += 30;
		} else if(material.equals("cashmere")) {
			price += 45;
		}
	}
	public double getPrice() {
		return price;
	}
	
	public String featureReport() {
		DecimalFormat d = new DecimalFormat(".00");
		return color + " " + size + " " + " blanket made from " + material + ", total price: $" + d.format(price);
	}
	
	
}
