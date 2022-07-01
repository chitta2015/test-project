package net.array;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]<ar[j+1]) 
				{
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
	}
	
	
	public static void main(String[] args) {
		
		int ar[]= {12,3,7,90,2,77,65,59};
		System.out.println(Arrays.toString(ar));
		BubbleSort.sort(ar);
		
		

	}

}
