package Day_5;
import java.util.Arrays;
public class $15_array_reverseElement {

	public static void main(String[] args) {
		int arr[]= {12,31,43,89};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			arr[i]= reverseNum(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static int reverseNum(int num) {
		int ans=0;
		while(num>0) {
			ans=ans*10+num%10;
			num/=10;
		}
		return ans;
	}
}
