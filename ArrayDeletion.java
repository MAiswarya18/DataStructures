package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
	 public static void main(String args[]) {
   	  System.out.println("Enter array size:");
   	  Scanner sc=new Scanner(System.in);
   	int a[]=new int[20]; 
   	  int elements=sc.nextInt();       	  
   	  for(int i = 0; i<elements; i++){
   		  System.out.print("Enter a number: ");
             a[i] = sc.nextInt();
   	  }
   	  System.out.println("Enter position to delete:");
   	  int delpo=sc.nextInt();
   	  for(int mypos=delpo-1;mypos<=elements;mypos++)
   	  {
   		  a[mypos]=a[mypos+1];
   	  }
	 elements--;
	 System.out.print(Arrays.toString(a)); 
	 }
}
