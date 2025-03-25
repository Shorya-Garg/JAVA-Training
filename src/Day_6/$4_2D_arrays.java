package Day_6;
import java.util.Arrays;
//Merge 2 shorted arrays to create sorted arrays
public class $4_2D_arrays {

	public static void main(String[] args) {
		int arr1[]= {2,4,6,};// if we add an extra comma it does effect array. only for arrays.
		int arr2[]= {1,3,5,7,9};
		int i = 0;
		int j = 0;
		int k=0;
		int [] res = new int[arr1.length + arr2.length];
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				res[k]=arr1[i];
				k++;
				i++;
			}
			else {
				res[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			res[k]=arr1[i];
			k++;
			i++;
		}
		
		while(j<arr2.length) {
			res[k]=arr2[j];
			k++;
			j++;
		}
		
		System.out.println(Arrays.toString(res));
	}

}
