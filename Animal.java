
public abstract class Animal {

	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	abstract String eat();
	
	public String walk() {
		return "this aminal walks with " + legs + " legs";
	}
	
}
