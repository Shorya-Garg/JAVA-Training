package Day_6;
import java.util.Scanner;
public class q02 {
	
	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sr.nextInt();
		System.out.println("Enter elements of array");
		int []arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sr.nextInt();
		}
		
		int res = min(arr,size);
		System.out.println(res);
	}

	public static int min(int [] arr, int s) {
		int min =arr[0];
		for(int i=0; i<s; i++) {
			if(min>arr[i]) {
				min= arr[i];
			}
		}
		return min;
	}
}
