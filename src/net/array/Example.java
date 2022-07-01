package net.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Example {
	
 public static void main(String[] args) throws NumberFormatException, IOException {
     
	 InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
	 
	 double a[]=new double[10];
     double lowerRange=-1.5,upperRange=1.5;
     int size=10;
     
     
     for(int i=0;i<size;)
     {
         System.out.print("Enter value at "+i+" index:");
         double value=Double.parseDouble(br.readLine());
         
         if(value>=-1.5 && value<=1.5)
         {
        	 System.out.println("Correct data!!");
        	 a[i]=value;
        	 i++;
         }
         else
         {
        	 System.out.println("Wrong data!!");
         }
     }
 }
}