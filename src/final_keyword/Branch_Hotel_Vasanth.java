package final_keyword;

public class Branch_Hotel_Vasanth 
//extends Hotel_Vasanth 
//final class cannot extend
{

	public static void main(String[] args) {
		
		Branch_Hotel_Vasanth vnr = new Branch_Hotel_Vasanth();
		//vnr.meals =200;  // final varibale cannot reassign
		/*
		 * System.out.println(vnr.meals); vnr.prepareFood();
		 */
		vnr.prepareFood2();

	}
	//final method cannot override
	/*
	 * void prepareFood() { System.out.println("Low quality"); }
	 */
	
	void prepareFood2() {
		 System.out.println("Low quality"); 
	}
}
