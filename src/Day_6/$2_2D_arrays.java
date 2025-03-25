package Day_6;
import java.util.Arrays;
public class $2_2D_arrays {
//sum of diagnol
	public static void main(String[] args) {
		int [][] arr = {{1,2,8},{23,0,8},{9,3,7}};
		int sum=0;
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				if (i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);

	}

}
