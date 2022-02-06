import java.util.*;
public class minintoyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in minute");
        int a= sc.nextInt();
        int day=a/1440;
        if(day>=365){
            int year=day/365;
            day=day%365;
            System.out.println(a+" minutes there is "+year+" year and "+day+" days");
        }
        else {
            System.out.println("there is "+day+" days");
        }
        sc.close();
    }
}

