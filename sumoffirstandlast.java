import java.util.*;
public class sumoffirstandlast {
	public static int first(int num) {
		while(num>=10)
			num/=10;
		
		return num;
	}
	public static int last(int num) {
		return(num%10);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		int num = sc.nextInt();
		System.out.println(first(num) + last(num));
		sc.close();

	}

}
