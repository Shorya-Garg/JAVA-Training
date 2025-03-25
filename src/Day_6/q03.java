package Day_6;
import java.util.Scanner;
public class q03 {
	
	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sr.nextInt();
		System.out.println("Enter elements of array");
		int []arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sr.nextInt();
		}
		
		int res = max_arr(arr,size);
		System.out.println(res);
	}

	public static int max_arr(int [] arr, int s) {
		int max =arr[0];
		for(int i=0; i<s; i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
		}
		return max;
	}
}
