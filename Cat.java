
public class Cat extends Animal implements Pet{

	public String catName;
	
	public Cat(String name) {
		super(4);
		this.catName = name;
	}
	
	public Cat() {
		super(4);
		catName = "";
	}
	
	public String getName() {
		return catName;
	}
	
	public void setName(String name) {
		catName = name;
	}
	
	public void play() {
		System.out.println("it play meow");
	}
	
	public String eat() {
		return "it eat tuna";
	}
	
}
