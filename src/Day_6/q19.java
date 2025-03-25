package Day_6;
import java.util.Scanner;
public class q19 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		double ans = avg_FirstHalf(arr,size);
		System.out.println(ans);
	}
	
	public static double avg_FirstHalf(int [] arr, int s) {
		int sum = 0;
		int count=0;
		for (int i=0; i<s/2; i++) {
			sum+=arr[i];
			count++;
			}
		return (double)sum/(double)count;
	}

}
