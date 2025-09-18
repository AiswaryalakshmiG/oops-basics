package OopsConcepts;
//compile time Polymorphism
public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading employee1 = new MethodOverloading();
		employee1.enquiry();
		employee1.enquiry(1234);
		employee1.enquiry(15.3f);
	}
//same method name with different number of arguments
	private void enquiry() {
		System.out.println("General Enquiry");

	}

	private void enquiry(int accNo) {
		System.out.println("Balance Checking");
	}
//same method name	with different type of arguments
	private void enquiry(float f) {
		System.out.println("Gold rate");
		
	}
}
