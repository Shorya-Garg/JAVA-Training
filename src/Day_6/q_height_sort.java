package Day_6;

import java.util.Arrays;

public class q_height_sort {
//sort names array according to height array.
	public static void main(String[] args) {
		String [] names= {"Mary","John","Emma"};
		int [] heights= {180,165,170};
		
		
		for(int i=0;i<heights.length-1;i++)
		{
			boolean swapped= false;
			for(int j=0; j<heights.length-i-1;j++)
			{
				if(heights[j]>heights[j+1])
				{
					int temp=heights[j];
					heights[j]=heights[j+1];
					heights[j+1]=temp;
					
					String temp2=names[j];
					names[j]=names[j+1];
					names[j+1]=temp2;
					
					
				}
				
				
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(heights));
	}


}
