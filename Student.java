package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("The id of the student is : "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The id of the student is : "+id);
		System.out.println("The name os the student is : "+name);	
	}
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("The email id of the student is : "+email);
		System.out.println("The contact number of the student is : "+phoneNumber);
	}
	public static void main(String[] args) {
		Student info = new Student();
		info.getStudentInfo(97);
		info.getStudentInfo(63, "Dharshan");
		info.getStudentInfo("dharshu@gmail.com" , "8897987786");
	}

}
