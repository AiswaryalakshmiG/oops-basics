package OopsConcepts;

public class AttributesAndMethods {
String name; //Instance Variable
int age;
int marks;

	public static void main(String[] args) {
		AttributesAndMethods student1 = new AttributesAndMethods();
		student1.name ="Aishu";
		student1.age =23;
		student1.marks = 470;
		
		AttributesAndMethods student2 = new AttributesAndMethods();
		student2.name = "Jeevasri";
		student2.age = 23;
		student2.marks = 480;
		
		student1.display();
		student2.display();
	}

//Instance Method
public void display() {
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Marks: " + marks);
}
}
