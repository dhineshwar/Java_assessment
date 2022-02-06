import java.util.*;
public class Targeted_Array {

	public static void main(String[] args) {
		int a[] = new int[10];
		   int count = 0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter 10 elements:");
		   for(int i=0; i<10; i++)
		    a[i] = sc.nextInt();
		   System.out.println("enter target element:");
		   int target = sc.nextInt();
		   for(int i=0; i<10; i++){
		      if(a[i] == target)
		       count++;
		    }
		   System.out.println(count);
		   sc.close();
	}

	}


