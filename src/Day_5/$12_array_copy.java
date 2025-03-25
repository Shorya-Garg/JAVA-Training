package Day_5;

public class $12_array_copy {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] newarr = new int[arr.length];
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=arr[i];
		}
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}

	}

}
