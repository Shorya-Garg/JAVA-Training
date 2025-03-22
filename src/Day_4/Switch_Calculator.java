package Day_4;
import java.util.Scanner;
public class Switch_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter second Operator (+, -, *, /): ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+' :{
			System.out.println(num1+num2);
		}break;
		
		case '-' :{
			System.out.println(num1-num2);
		}break;
		
		case '*' :{
			System.out.println(num1*num2);
		}break;
		
		case '/' :{
			System.out.println(num1/num2);
		}break;
		
		default :{
			System.out.println(-1);
		}
		
		}
	}

}
