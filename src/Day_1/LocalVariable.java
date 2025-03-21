package Day_1;

public class LocalVariable {

	public static void main(String[] args) {
		{
		int num = 20;
		System.out.println(num);
		}
		{
		int num = 25;
		System.out.println(num);
		}
		int num=100;  //In Java code will execute line by line.
		System.out.println(num);
	}

}
