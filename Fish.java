
public class Fish extends Animal implements Pet{

	public String fishName;
	
	public Fish(String name) {
		super(0);
		fishName = name;
	}
	
	public Fish() {
		super(0);
		fishName = "Piscene";
	}
	
	public String eat() {
		return "fish eat food";
	}
	
	public String walk() {
		return "fish cant walk and dont have legs";
	}
	
	public void play() {
		System.out.println("the fish play");
	}

	public String getName() {
		return fishName;
	}

	public void setName(String name) {
		fishName = name;
	}
	
}
