package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class MatrixAddition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		int rows,columns;
		
		System.out.println("----   First Matrix ----------");
		System.out.println("Enter the number of rows:");
		rows=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns:");
		columns=Integer.parseInt(br.readLine());
		
		int matrix1[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++) //controlling the rows
		{
			for(int j=0;j<columns;j++) //controlling the columns
			{
				System.out.println("Enter element at ["+i+"]["+j+"]"+"location:");
				matrix1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("--------   Second Matrix ----------");
		
		System.out.println("Enter the number of rows:");
		rows=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns:");
		columns=Integer.parseInt(br.readLine());
		
		int matrix2[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++) //controlling the rows
		{
			for(int j=0;j<columns;j++) //controlling the columns
			{
				System.out.println("Enter element at ["+i+"]["+j+"]"+"location:");
				matrix2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		
		int result[][]=new int[rows][columns];
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		
		System.out.println("--------   Final Matrix ----------");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
