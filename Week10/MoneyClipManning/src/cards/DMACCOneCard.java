package cards;
public class DMACCOneCard extends Card {
	private String idNumber;
	
	public DMACCOneCard() {
		
	}
	
	public DMACCOneCard(String name, String idNumber) {
		super(name);
		setIdNumber(idNumber);
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String format() {
		return super.format() + ", ID: " + idNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DMACCOneCard other = (DMACCOneCard) obj;
		if (idNumber == null) {
			if (other.idNumber != null)
				return false;
		} else if (!idNumber.equals(other.idNumber))
			return false;
		return true;
	}
	
	


	

}
