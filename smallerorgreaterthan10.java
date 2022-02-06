import java.util.*;
public class smallerorgreaterthan10 {
	public static String smallBig(int num) {
		String a;
		if(num>10) {
		a="Greater than 10";
		if(num>53) {
		a="Greatest";
			}
		}
		else {
			a="Smaller";
		}
		return a;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int eon = sc.nextInt();
		String result = smallBig(eon);
		System.out.println(result);
		
		sc.close();

	}

}

