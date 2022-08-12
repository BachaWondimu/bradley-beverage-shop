import java.util.Objects;

/**
 * 
 */

/**
 * @author bacha12
 *
 */
public class Coffee extends Beverage{
	
	

	private boolean extraShot;
	private boolean extraSyrup;
	
	
	

	/**
	 * @param beverageName
	 * @param size
	 * @param beverageSize
	 */
	public Coffee(String beverageName, SIZE size,  boolean extraShot, boolean extraSyrup) {
		super(beverageName, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}



/**
 * 
 */
	@Override
	public String toString() {
		return "Coffee [Name =" + getBevName()
		+ ", Type=" + getType() 
		+ ", Size=" + getSize() 
		+ ", ExtraShot=" + extraShot 
		+ ", EtraSyrup=" + extraSyrup 
		+ ", Price=" + calcPrice() +"]";
	}

	
/**
 * 
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return Objects.equals(getBevName(), other.getBevName()) 
				&& getSize() == other.getSize()
				&& getType() == other.getType()
				&& extraShot == other.extraShot
				&& extraSyrup == other.extraSyrup;
	}



/**
 * @return the extraShotOrSyrup
 */
public boolean isExtraShot() {
	return extraShot;
}




/**
 * @return the extraSyrup
 */
public boolean isExtraSyrup() {
	return extraSyrup;
}


public boolean getExtraShot() {
	return this.extraShot;
}



public boolean getExtraSyrup() {
	return this.extraSyrup;
}



public void setExtraShot(boolean extraShot) {
	this.extraShot = extraShot;
}



public void setExtraSyrup(boolean extraSyrup) {
	this.extraSyrup = extraSyrup;
}



@Override
public double calcPrice() {
	double price = getBasePrice();
	if (extraShot)
		price += 0.5;
	if(extraSyrup)
		price += 0.5;
	if(this.getSize() == SIZE.MEDIUM)
		price += super.SIZEPRICE;
	if(this.getSize() == SIZE.LARGE)
		price += (super.SIZEPRICE + super.SIZEPRICE);
		
	return price;
}



public double getBasePrice() {
	
	return super.BASEPRICE;
}










}
