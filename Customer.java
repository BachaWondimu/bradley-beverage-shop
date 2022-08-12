
public class Customer {
	
	
	
	private String name;
	private int age;
	
	
	
	
	/**
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//Copy Constructor
	public Customer(Customer c) {
		this.name = c.name;
		this.age = c.age;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
