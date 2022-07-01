package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		int ar[];
		
		ar=new int[5];
		
		int ar1[]=new int[10];
		//int []ar2=new int[10];
		//int[] ar3=new int[10];
		
		/*
		 * ar1[0]=10; ar1[1]=20; ar1[2]=30; ar1[3]=40;
		 */
		
		System.out.println("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		
		ar1=new int[size];
		
		//Dynamic array input
	   for(int i=0;i<ar1.length;i++)
	   {
		   System.out.println("Enter element at index "+i+":");
		   ar1[i]=Integer.parseInt(br.readLine());
	   }
		
		
		//Displaying array elements
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		
		

	}

}
