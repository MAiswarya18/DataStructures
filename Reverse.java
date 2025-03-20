package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	  	int a[]=new int[20];
		System.out.println("Enter array size:");
  	    int size=sc.nextInt();
        for(int i = 0; i<size; i++){
  		  System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
  	    }
        for(int i = 0; i<size; i++){
    		  System.out.print(a[i]+" ");
	    }
        int left=0;
        int right=size-1;
        while(left<right)
        {
        	int temp=a[left];
        	a[left]=a[right];
        	a[right]=temp;
        	left++;
        	right--;
        }
        System.out.println();
        System.out.print(Arrays.toString(a));
	}
}
