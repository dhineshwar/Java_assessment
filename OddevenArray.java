import java.util.*;
public class OddevenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				   int even = 0, odd = 1;
				   int a[] = new int[8];
				    int val = 0;
				   for(int i=0;i<8;i++){
				    
				     val = sc.nextInt();
				     
				     if(val%2==0)
				      {
				        a[even] = val;
				        even += 2;
				      }
				     else
				      {
				       a[odd] = val;
				       odd += 2;
				       }
				    }
				  System.out.println("Array elements are:");
				  for(int i=0; i<8; i++)
				    System.out.print(a[i]+" ");
				  
				  sc.close();

			}

		
	}


