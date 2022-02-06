import java.util.*;
public class concatinationofstrings {
	 public static String concatination(String a, String b){
	        String c=a+b;
	        return c;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String a= sc.nextLine();
	        String b= sc.nextLine();
	        System.out.println(concatination(a, b));
sc.close();
	    }
	}

