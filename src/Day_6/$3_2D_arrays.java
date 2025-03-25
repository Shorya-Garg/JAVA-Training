package Day_6;
import java.util.Arrays;
public class $3_2D_arrays {
//maximum of columns
	public static void main(String[] args) {
		int [][] arr = {{1,2,8},{23,0,8},{9,3,7}};
		for(int i=0; i<arr.length ; i++)
		{   int max = arr[0][i];
			for(int j=0; j<arr[i].length;j++)
			{ 
				if(max<arr[j][i]) {
					max=arr[j][i];
				}
			}
			System.out.println(max);
		}

	}

}
