package OopsConcepts;

public class ConstructorLearning {
	// non initialized global variable/fields : print default value
String prod_name; 
int price, discount;
public ConstructorLearning(String prod_name, int price, int discount) {
	this.prod_name = prod_name;
	this.price = price;
	this.discount = discount;
	//System.out.println(prod_name+" " + price +  " "+ discount);
}
public static void main(String[] args) {
	ConstructorLearning prod1 = new ConstructorLearning("Soap",20,2);
	//prod1.prod_name="Soap";
	//prod1.price = 20;
	//prod1.discount = 2;
	ConstructorLearning prod2 = new ConstructorLearning("Shampoo", 102,2);
	//prod2.prod_name="Shampoo";
	//prod2.price = 102;
	//prod2.discount = 2;
	ConstructorLearning prod3 = new ConstructorLearning("Biscuit",25,3);
	//prod3.prod_name="Biscuit";
	//prod3.price = 25;
	//prod3.discount = 1;
	
	prod1.sell();
	prod1.giveback();
	
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
