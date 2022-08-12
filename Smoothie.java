import java.util.Objects;

public class Smoothie extends Beverage{
	
	
	
	private int numOfFruits;
	private boolean proteinPowder;
	

	public Smoothie(String beverageName, SIZE size, int i, boolean b) {
		super(beverageName,TYPE.SMOOTHIE, size);
		this.numOfFruits = i;
		this.proteinPowder = b;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Smoothie [Name =" + getBevName()
				+ ", Type=" + getType()
				+ ", Size=" + getSize()
				+ ", NumOfFruits=" + numOfFruits 
				+ ", ProteinPowder=" + proteinPowder 
				+ ", Price=" + calcPrice() + "]";
	}


	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smoothie other = (Smoothie) obj;
		return numOfFruits == other.numOfFruits && proteinPowder == other.proteinPowder;
	}





	@Override
	public double calcPrice() {
		double price = getBasePrice();
		if(proteinPowder)
			price += 1.5;
		if(numOfFruits > 0)
			price += numOfFruits*0.5;
		if(this.getSize() == SIZE.MEDIUM)
			price += super.SIZEPRICE;
		if(this.getSize() == SIZE.LARGE)
			price += (super.SIZEPRICE + super.SIZEPRICE);
			
		return price;
	}



	public double getBasePrice() {
		return super.BASEPRICE;
	}






	/**
	 * @return the numOfFruits
	 */
	public int getNumOfFruits() {
		return numOfFruits;
	}






	/**
	 * @param numOfFruits the numOfFruits to set
	 */
	public void setNumOfFruits(int numOfFruits) {
		this.numOfFruits = numOfFruits;
	}






	/**
	 * @return the proteinPowder
	 */
	public boolean isProteinPowder() {
		return proteinPowder;
	}






	/**
	 * @param proteinPowder the proteinPowder to set
	 */
	public void setProteinPowder(boolean proteinPowder) {
		this.proteinPowder = proteinPowder;
	}






	public boolean getAddProtein() {
		return proteinPowder;
	}






	public boolean getAddProtien() {
		
		return true;
	}






	
	
	

}
