package Day_3;

public class method_overloading {

	public static void main(String[] args) {
		System.out.println(convert(50));

	}
//	public static String convert(int a) {  It Automatically convert to long
//		return ""+a;
//	}
	
	public static String convert(double a) {
		return ""+a;
	}
	
	public static String convert(char a) {
		return ""+a;
	}
	
//	public static String convert(byte a) {
//		return ""+a;
//	}
	
//	public static String convert(float a) {
//		return ""+a;
//	}
//	
	public static String convert(long a) {
		return ""+a;
	}
	
//	public static String convert(short a) {
//		return ""+a;
//	}
	
	public static String convert(boolean a) {
		return ""+a;
	}
}
