package assignment6;

public class Test2 {

	public static void main(String[] args) {
		Pet p = new Pet("Spot", "Mary", "Black and White");//assign values of pet name, owner name, color 
		p.setSex(0);
		System.out.println(p.toString() + "\n");
		
		Cat cat1 = new Cat("Tom", "Bob", "Black", "short");//assign values of pet name, owner name, color, hair length 
		cat1.setSex(2);
		System.out.println(cat1.toString());
		cat1.setBoardStart(7,1,2018);
		cat1.setBoardEnd(10,21,2018);
		System.out.println("Boardable: " + cat1.boarding(7,1,2018) + "\n");
		
		Dog dog1 = new Dog("Spot", "Susan", "White", "medium");//assign values of pet name, owner name, color, size
		dog1.setSex(2);
		System.out.println(dog1.toString());
		dog1.setBoardStart(3,28,2017);
		dog1.setBoardEnd(9,30,2018);
		System.out.println("Boardable: " + dog1.boarding(10,20,2018) + "\n");
		}
	
}

