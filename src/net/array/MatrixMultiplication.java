package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Multiplication
{
	public void display(int matrix[][],int rows,int columns)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	public void multiplication(int row1,int col1, int matrix1[][],int row2,int col2,int matrix2[][])
	{
		int i,j,k;
		
		int result[][]=new int[row1][col2];
		System.out.println("----   First Matrix ----------");
		this.display(matrix1, row1, col1);
		System.out.println("----   Second Matrix ----------");
		this.display(matrix2, row2, col2);
		if(row2!=col1)
		{
			System.out.println("Operation not possible!!");
			return;
		}
		
		
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				for(k=0;k<row2;k++)
				{
					result[i][j]=result[i][j]+(matrix1[i][k]*matrix2[k][j]);
					
				}
			}
		}
		System.out.println("----   Resultant Matrix ----------");
		this.display(result, row1, col2);
		
	}
	
	
}




public class MatrixMultiplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		int rows1,columns1,rows2,columns2;
		
		System.out.println("----   First Matrix ----------");
		System.out.println("Enter the number of rows:");
		rows1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns:");
		columns1=Integer.parseInt(br.readLine());
		
		int matrix1[][]=new int[rows1][columns1];
		
		for(int i=0;i<rows1;i++) //controlling the rows
		{
			for(int j=0;j<columns1;j++) //controlling the columns
			{
				System.out.println("Enter element at ["+i+"]["+j+"]"+"location:");
				matrix1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("--------   Second Matrix ----------");
		
		System.out.println("Enter the number of rows:");
		rows2=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number of columns:");
		columns2=Integer.parseInt(br.readLine());
		
		int matrix2[][]=new int[rows2][columns2];
		
		for(int i=0;i<rows2;i++) //controlling the rows
		{
			for(int j=0;j<columns2;j++) //controlling the columns
			{
				System.out.println("Enter element at ["+i+"]["+j+"]"+"location:");
				matrix2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		 Multiplication m=new Multiplication();
		 m.multiplication(rows1, columns1, matrix1, rows2, columns2, matrix2);
 
	}

}
