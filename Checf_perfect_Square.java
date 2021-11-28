import java.util.*;
public class Checf_perfect_Square {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number");
		  int number=sc.nextInt();
		  double a=Math.sqrt(number);
		  if(a==(int)a)
		  {
			System.out.println("Given number is perfect sqaure");
		  }
		  else
		  {
			System.out.println("Given number is not a perfect square");
			
		}

		}
	}
