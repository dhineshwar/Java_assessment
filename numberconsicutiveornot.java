import java.util.*;
public class numberconsicutiveornot {
	public static boolean consecutive(int[] arr, int size) {
		boolean con = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr[i++])
				con = true;
		}
		return con;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of array");
	    int a= sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Fill the array");		
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int n= sc.nextInt();
        System.out.println(consecutive(arr,n));
        sc.close();
		

	}

}

