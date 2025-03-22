package Day_3;

public class Method_overloading_datatype {

	public static void main(String[] args) {
		add(2,5);
		add(4,5.3f);
		}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a, double b) {
		System.out.println(a+b);
		
	}
}
