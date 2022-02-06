import java.util.*;
public class addASKIII3 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter the character");
	        char ch=sc.nextLine().charAt(0);
	        System.out.println("enter the  value you want to add in tha ascii value of this character");
	        int num=sc.nextInt();
	        int value=ch+num;
	        char result=(char)value;
	        System.out.println(result);
sc.close();
	    }
	}

