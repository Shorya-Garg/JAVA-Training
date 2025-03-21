package Day_2;

public class Max_of_three_numbers {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 23;
		int num3 = 96;
		int max = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
		System.out.println(max);

	}

}
