package Day_5;
import java.util.Scanner;
public class $8_Loop_ques2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num = sr.nextInt();
		while(num/10!=0) {
			num = SumOfDigits(num);
		}
		System.out.println(num);
	}
	
	public static int SumOfDigits(int num) {
		int sum = 0;
		while(num>0){
			sum = sum+num%10;
			num/=10;
		}
		return sum;
	}

}
