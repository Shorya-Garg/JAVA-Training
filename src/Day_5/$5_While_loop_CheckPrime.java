package Day_5;
import java.util.Scanner;
public class $5_While_loop_CheckPrime {

	public static void main(String[] args) {// Check for Prime
		Scanner sr = new Scanner(System.in);
		int num = sr.nextInt();
		IsPrime(num);
	}
	public static void IsPrime(int num) {
		int count=0;
		int i=1;
		while(i<=num/2) {
			if (num%i==0)
				count++;
			i++;
		}
		if(count>1) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");}
	}
}
