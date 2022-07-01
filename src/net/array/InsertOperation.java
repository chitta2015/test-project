package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertOperation {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int size=6;
	  int ar []=new int[size];
	  for(int i=0;i<size-1;i++)
	  {
		  System.out.println("Enter value:");
		  ar[i]=Integer.parseInt(br.readLine());
	  }
	
	  for(int i=0;i<size-1;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
	  System.out.println();
	  
	  int key=57;
	  int index=2;
	  
	  int length=ar.length;
	  
	 
	  
	  for(int i=length-1;i>=index;i--)
	  {
		  ar[i]=ar[i-1];
	  }
	  
	  ar[index]=key;
	  
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
	  
	  
	  
	  
	}

}
