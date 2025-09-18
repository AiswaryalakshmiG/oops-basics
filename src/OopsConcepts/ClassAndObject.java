package OopsConcepts;

public class ClassAndObject {
String name;
int age;
public static void main(String[] args) {
	ClassAndObject student1 = new ClassAndObject();
	student1.name = "Aishu";
	student1.age = 23;
	student1.display();
	
	ClassAndObject student2 = new ClassAndObject();
	student2.name = "Jeevasri";
	student2.age = 12;
	student2.display();
}
public void display() {
	System.out.println("Name: " + name + ", Age: " + age);
}
}
