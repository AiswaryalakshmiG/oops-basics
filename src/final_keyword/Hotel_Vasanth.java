package final_keyword;

final public class Hotel_Vasanth //final class
{
final int meals = 100; // final varibale
public static void main(String[] args) {
	Hotel_Vasanth madurai = new Hotel_Vasanth();
	madurai.prepareFood();
}
final void prepareFood()//final method
{
	System.out.println("hygenic food");
}
}
