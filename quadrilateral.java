import java.util.*;
public class quadrilateral {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt ();
		int b = sc.nextInt ();
		int c = sc.nextInt ();
		int d = sc.nextInt ();
		
		if ((a+b+c+d) == 360)
		{
			System.out.print("it is quadrilateral");
		}else 
		{
			System.out.print("it is not quadrilateral");
		}

	}

}
