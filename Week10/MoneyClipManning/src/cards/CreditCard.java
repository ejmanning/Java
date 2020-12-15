package cards;
public class CreditCard extends Card {
	private String cardNumber;
	private int cvv;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String name, String cardNumber, int CVV) {
		super(name);
		setCardNumber(cardNumber);
		setCvv(CVV);
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getcvv() {
		return cvv;
	}

	public void setCvv(int CVV) {
		cvv = CVV;
	}
	
	public String format() {
		return super.format() + ", Card Number: " + cardNumber + ", CVV: " + cvv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + cvv;
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
		CreditCard other = (CreditCard) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (cvv != other.cvv)
			return false;
		return true;
	}
	
	

}
