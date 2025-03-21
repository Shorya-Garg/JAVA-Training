package Day_3;

public class Method_overloading_datatype {

	public static void main(String[] args) {
		add(2,5);
		add(4.7,5.3);
		}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
}
