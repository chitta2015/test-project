package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		int rows,columns;
		
		System.out.println("Enter the number of rows:");
		rows=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns:");
		columns=Integer.parseInt(br.readLine());
		
		int ar[][]=new int[rows][columns]; //2-D array declaration
		int ar1[][]= {{12,3,56},{67,89,56},{3,99,89}};
		
		for(int i=0;i<rows;i++) //controlling the rows
		{
			for(int j=0;j<columns;j++) //controlling the columns
			{
				System.out.println("Enter element at ["+i+"]["+j+"]"+"location:");
				ar[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar1[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
