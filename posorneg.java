import java.util.*;
public class posorneg {
	public static String PosNeg(int num) {
		String a;
		if(num>0) {
			a="Positive";
		}
		else {
			a="Negative";
		}
		return a;
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int eon = sc.nextInt();
		String result = PosNeg(eon);
		System.out.println(result);
		
		sc.close();

	}

}

