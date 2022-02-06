import java.util.Scanner;
import java.util.Arrays;
public class findfirstindex {
	public static void main(String args[]) {
	      System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      System.out.println("Enter the elements of the array one by one ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = s.nextInt();
	      }
	      boolean isFound = false;
	      System.out.println("Find num.?:");
	      int toFind = s.nextInt();
	      for(int n: myArray) {
	    	  if(n == toFind) {
	    		  isFound = true;
	    	  	   break;
	    	  }
	      }
	      if(isFound)
	          System.out.println(toFind + " is found.");
	        else
	          System.out.println(toFind + " is not found.");
	      s.close();
	      
	      System.out.println("Contents of the array are: "+Arrays.toString(myArray));
	   }
	   
	}

