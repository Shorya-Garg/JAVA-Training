package Day_3;

public class Return_Type {

	public static void main(String[] args) {
		int sum = add(20,30);
		System.out.println(sum);
	}
	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum; /* if we don't return anything in method other than 
		void compiler show error*/
	}

}
