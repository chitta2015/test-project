package net.array;

public class SecondLargest {

	public static void main(String[] args) {
		int ar[]= {12,3,56,78,90,76,98};
		
		int firstLargest=ar[0];
		int secondLargest=ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>firstLargest)
			{
				secondLargest=firstLargest; //s=12 s=56 s=78 s=90
				firstLargest=ar[i];         //f=56 f=78 f=90 f=98
				
			}
			else if(secondLargest<ar[i])
			{
				secondLargest=ar[i];
			}
		}
		
		System.out.println(secondLargest);

	}

}
