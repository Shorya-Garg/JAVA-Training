package Day_6;
import java.util.Scanner;
public class q14 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		double ans = Lasthalf_ArrSum(arr,size);
		System.out.println(ans);
	}
	
	public static double Lasthalf_ArrSum(int [] arr, int s) {
		int sum = 0;
		for (int i=s/2; i<s; i++) {
			sum+=arr[i];
			}
		return sum;
	}

}
