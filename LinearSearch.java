package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void Linear(int temp[],int f)
	{
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==f)
			{
				System.out.println("Match found at the index "+i);
				return;
			}
		}
		System.out.println("Not found");
	}
	 public static void main(String args[]) {
	System.out.println("Enter array size:");
 	  Scanner sc=new Scanner(System.in);
 	int a[]=new int[7]; 
 	  int elements=sc.nextInt();       	  
 	  for(int i = 0; i<elements; i++){
 		  System.out.print("Enter a number: ");
           a[i] = sc.nextInt();
 	  }
 	  System.out.println(Arrays.toString(a));
 	  System.out.println("What value you need to find");
 	  int find=sc.nextInt();
 	  Linear(a, find);
	 }

}
