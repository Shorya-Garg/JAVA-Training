package Day_5;
import java.util.Scanner;
public class $4_While_loop_FactorOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1, count=0;
		while(i<=num/2){
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(num);
		System.out.println("================");
		System.out.println(count+1);// Number of Factors
	}

}
