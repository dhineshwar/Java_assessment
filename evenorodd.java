import java.util.*;
public class evenorodd {

	public static String evenOdd(int num) {
		String a;
		if(num%2 == 0) {
			a= "Even";
		} else {
			a= "Odd";
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Print number to be checked");
		int n = sc.nextInt();
		String result = evenOdd(n);
		System.out.println(result);
		sc.close();
		

	}

}

