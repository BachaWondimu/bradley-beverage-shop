import java.util.Objects;

public abstract class Beverage {

	
	private String bevName;
	public TYPE beverageType;
	public SIZE beverageSize;
	final public double BASEPRICE = 2.0;
	final public int SIZEPRICE = 1;
	

	public Beverage(String bevName, TYPE beverageType, SIZE beverageSize) {
		this.bevName = bevName;
		this.beverageType = beverageType;
		this.beverageSize = beverageSize;
	}

	

	public abstract double calcPrice();

	
	@Override
	public String toString () {
		return "Beverage Name=" + bevName
				+ ", Beverage Type=" + beverageType
				+ ", Beverage Size=" + beverageSize;
		
	}



	
	public boolean equals(Beverage bev) {
		if (this == bev)
			return true;
		if (bev == null)
			return false;
		return Objects.equals(bevName, bev.bevName) 
				&& beverageSize == bev.beverageSize
				&& beverageType == bev.beverageType;
	}



	/**
	 * @return the beverageName
	 */
	public String getBevName() {
		return bevName;
	}



	/**
	 * @param beverageName the beverageName to set
	 */
	public void setBevName (String bevName) {
		this.bevName = bevName;
	}

	

	/**
	 * @return the beverageType
	 */
	public TYPE getType() {
		return beverageType;
	}



	/**
	 * @param beverageType the beverageType to set
	 */
	public void setType(TYPE beverageType) {
		this.beverageType = beverageType;
	}



	/**
	 * @return the beverageSize
	 */
	public SIZE getSize() {
		return beverageSize;
	}



	/**
	 * @param beverageSize the beverageSize to set
	 */
	public void setSize(SIZE beverageSize) {
		this.beverageSize = beverageSize;
	}
	
}
