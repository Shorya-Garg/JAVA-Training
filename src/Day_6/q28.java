package Day_6;
import java.util.Scanner;
public class q28 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.nextInt();
		}
		System.out.println("Enter key to be search");
		int key = sr.nextInt();
		int res = indexOfElement(arr,key);
		System.out.println(res);
	}
	
	public static int indexOfElement(int[] arr, int key)
	{
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}