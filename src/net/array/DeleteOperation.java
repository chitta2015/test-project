package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteOperation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int size=6;
	  int ar []=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Enter value:");
		  ar[i]=Integer.parseInt(br.readLine());
	  }
	
	  for(int i=0;i<size;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
	  System.out.println();
	  
	  int index=3;
	  
	  for(int i=index;i<size-1;i++)
	  {
		  ar[i]=ar[i+1];
	  }
	  size=size-1;
	  
	  for(int i=0;i<size;i++)
	  {
		  System.out.print(ar[i]+" ");
	  }
	  System.out.println();

	}

}
