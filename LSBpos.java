import java.util.*;
public class LSBpos {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    int num= sc.nextInt();
    if((num & 1)==1){
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
    sc.close();
}
}
