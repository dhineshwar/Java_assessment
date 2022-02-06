import java.util.*;
public class NoofVCowelsinstring {

	public static void main(String[] args) {
		 int count = 0;
	      System.out.println("Enter a str :");
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();

	      for (int i=0 ; i<str.length(); i++){
	         char ch = str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given str is "+count);
	sc.close();   
	}
}
	


