package OopsConcepts;

public class ConstructorOverloading {
		// non initialized global variable/fields : print default value
	String prod_name; 
	int price, discount;
	public ConstructorOverloading(String prod_name, int price, int discount) {
		this.prod_name = prod_name;
		this.price = price;
		this.discount = discount;
	}
	//same method name with diff num or type of arguments
	public ConstructorOverloading(String prod_name, int price) {
		this.prod_name = prod_name;
		this.price = price;
	}
	public static void main(String[] args) {
		ConstructorOverloading prod1 = new ConstructorOverloading("Soap",20,2);
		ConstructorOverloading prod2 = new ConstructorOverloading("Shampoo", 102,2);
		ConstructorOverloading prod3 = new ConstructorOverloading("Biscuit",25,3);
		ConstructorOverloading prod4 = new ConstructorOverloading("Rice",70);
		
		prod1.sell();
		prod4.giveback();
		
	}
	private void giveback() {
		System.out.println("Product name: "+prod_name);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
		
	}
	private void sell() {
		System.out.println("Product name: "+prod_name);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
		
	}


}
