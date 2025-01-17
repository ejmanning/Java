//Erica Manning
public class ElectricBlanket extends Blanket {
	private int heatSettings;
	private boolean hasAutoShutOff;
	

	public ElectricBlanket() {
		super();
		heatSettings = 1;
		hasAutoShutOff = false;
		
	}
	public ElectricBlanket(String size, String color, String material, int heatSettings, boolean hasAutoShutOff) {
		super(size, color, material);
		setHeatSettings(heatSettings);
		setHasAutoShutOff(hasAutoShutOff);
	}
	public int getHeatSettings() {
		return heatSettings;
	}
	public void setHeatSettings(int heatSettings) {
		this.heatSettings = heatSettings;
		
		if (heatSettings < 1 || heatSettings < 5) {
			heatSettings = 1;
		}
	}
	public boolean isHasAutoShutOff() {
		return hasAutoShutOff;
	}
	
	public void setHasAutoShutOff(boolean hasAutoShutOff) {
		this.hasAutoShutOff = hasAutoShutOff;
		
		if(hasAutoShutOff) {
			this.price += 5.75;
		}
	}
	@Override
	public String featureReport() {
		String autoShutOffMsg = "";
		if (hasAutoShutOff) {
			autoShutOffMsg = "with auto shut off";
		} else {
			autoShutOffMsg = "without auto shut off";
		}
		return super.featureReport() + " including " + heatSettings + " settings " + autoShutOffMsg;
	}
	
	
	
	
}
