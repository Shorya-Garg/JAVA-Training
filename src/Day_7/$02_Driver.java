package Day_7;
import Day_6.Object; // Import class of different package.
public class $02_Driver {
	
	public static void main(String[] args) {
		$01_Student s1 = new $01_Student();
		System.out.println("Name    : "+s1.name);  //print default values
		System.out.println("Roll No.: "+s1.rollno);
		s1.name="Shorya Garg";
		s1.rollno=152;
		System.out.println("Name    : "+s1.name);//print assigned values.
		System.out.println("Roll No.: "+s1.rollno);
		
		Object s2 = new Object(); // create object of class of different package.
		System.out.println(s2);
		s2.rollno = 3;
		System.out.println(s2.rollno);
		System.out.println(s2);
		
	}
}
