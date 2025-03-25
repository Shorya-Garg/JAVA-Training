package Day_6;
import java.util.Scanner;
import java.util.Arrays;
public class q31 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		String [] arr = new String [size];
		System.out.println("Enter elements of array");
		for(int i = 0 ; i<size; i++) {
			arr[i]=sr.next();
		   }
		rev_FirstHalf(arr);
		System.out.println(Arrays.toString(arr));
	}
	// Also use While loop with 2 pointers.
	public static void rev_FirstHalf(String [] arr)
	{
		for(int i=0 ; i<arr.length/4; i++)
		{
			String str=arr[i];
			arr[i]=arr[(arr.length/2)-1-i];
			arr[(arr.length/2)-1-i]=str;
		}
		
	}
	
}