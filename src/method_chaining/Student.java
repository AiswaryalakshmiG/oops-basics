package method_chaining;

public class Student {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.read().write().sleep();
	}
	Student read() {
        System.out.println("Student is reading");
        return this; 
    }
	
	  Student write() {
	        System.out.println("Student is writing");
	        return this;
	    }

	    Student sleep() {
	        System.out.println("Student is sleeping");
	        return this;
	    }
}
