package Day_5;
import java.util.Scanner;
public class $9_loop_ques3 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int num = sr.nextInt();
		int sum = 0;
		while(num>0){
			int d=num%10;
			if(d%2==0) {
			sum = sum+num%10;
			}
			num/=10;
		}
		System.out.println(sum);

	}

}
