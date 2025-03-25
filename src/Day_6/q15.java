package Day_6;
import java.util.Scanner;
public class q15 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		double ans = min_FirstHalf(arr,size);
		System.out.println(ans);
	}
	
	public static double min_FirstHalf(int [] arr, int s) {
		int min = arr[0];
		for (int i=0; i<s/2; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			}
		return min;
	}

}
