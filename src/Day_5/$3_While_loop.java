package Day_5;
import java.util.Scanner;
public class $3_While_loop {

	public static void main(String[] args) {//Same as previous but length of inputs can be different.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();//123
		int num2 = sc.nextInt();//4567
		int revnum1= revNum(num1);
		int ans=0;//1726354
		while(revnum1>0 || num2>0) {
			if(revnum1>0) {
				ans= ans*10 + revnum1%10;
				revnum1/=10;
			}
			
			if(num2>0) {
				ans= ans*10 + num2%10;
				num2/=10;
			}
		}
		System.out.println(ans);
	}
	
	public static int revNum(int num) {
		int ans = 0;
		while(num>0) {
			ans = ans*10 + num%10;
			num/=10;
		}
		return ans;
	}
}
