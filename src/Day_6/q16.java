package Day_6;
import java.util.Scanner;
public class q16 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		double ans = min_SecondHalf(arr,size);
		System.out.println(ans);
	}
	
	public static double min_SecondHalf(int [] arr, int s) {
		int min = arr[s/2];
		for (int i=s/2; i<s; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			}
		return min;
	}

}
