package Day_8;

public class q1 {

	public static void main(String[] args) {
		int arr[]= {0,0,1,1,1,0,0,1,1,0,0,0};
		int z=0;
		int o=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				o++;
			}
			else {
				z++;
			}
		}
		for(int q=0;q<o;q++) {
			System.out.print("1,");
		}
		for(int t=0;t<z;t++) {
			System.out.print(",0");
		}
		}

	}


