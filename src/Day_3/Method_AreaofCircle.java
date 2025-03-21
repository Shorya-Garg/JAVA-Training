package Day_3;

public class Method_AreaofCircle {

	public static void main(String[] args) {
		double Area = AOC(7);
		System.out.println(Area);
	}
	
	public static double AOC(double r) {
		double Area;
		Area = (22/7)*r*r;
		return Area;
	}
}
