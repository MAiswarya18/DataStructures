package DataStructure;
import java.util.Arrays;
import java.util.Scanner;
public class MinMax {
          public static void main(String args[]) {
        	  System.out.println("Enter array size:");
        	  Scanner sc=new Scanner(System.in);
        	  int elements=sc.nextInt();
        	  int a[]=new int[elements];        	  
        	  for(int i = 0; i<elements; i++){
        		  System.out.print("Enter a number: ");
                  a[i] = sc.nextInt();
        	  }
        	  int min=a[0];
        	  int max=a[0];
        	  for(int i = 0; i<elements; i++) {
               if(a[i]>max) {
                	  max=a[i];
               }   
                if(a[i]<min) {
            	  min=a[i];
              }
        	  }
        	  System.out.println(Arrays.toString(a));
        	  System.out.println("Maximum value:"+max);
        	  System.out.println("Minimum value:"+min);

          }
}
