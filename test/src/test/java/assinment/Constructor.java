package assinment;

public class Constructor {
	String name;
	int age;
	//constructor
	public Constructor(String name,int age) {
		this.name=name;
		this.age=age;
		}
	
//non static method
public void displayInfo() {
	System.out.println("Name" +name);
	System.out.println("Age"+age);}
	
	public static void main(String[] args) {
	//creating an instance of constructor using constructor
		
		Constructor M2 = new Constructor("pokhara",30);
		//calling the non static method by using object
		M2.displayInfo();

	}}

	
