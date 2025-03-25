package Day_5;

public class $13_array_merge {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		int count=0;
		int arr[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr[i]=arr1[i];
			count++;
		}
		for(int i=1;i<arr2.length;i++) {
			arr[count]=arr2[i];
			count++;
		}
		for(int i=0;i<arr1.length+arr2.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
