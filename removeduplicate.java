import java.util.*;
public class removeduplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		   for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		  int temp=a[0];
		  System.out.print(a[0]);
		  for(int i=1;i<n;i++)
		   {
		     if(a[i]==temp)
		      continue;
		     else{
		      System.out.print(" "+a[i]);
		      temp=a[i];
		     }
		   }  

	}

}

