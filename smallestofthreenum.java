import java.util.*;
public class smallestofthreenum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int result = (a<b && b<c)? a:(b<a && b<c)? b:c;
		System.out.println(result);
		sc.close();
	}

}

