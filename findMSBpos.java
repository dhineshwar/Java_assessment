import java.util.*;
public class findMSBpos {
	static int msb(int n)
    {
        if (n == 0)
            return 0;
 
        int msb = 0;
        n = n / 2;
 
        while (n != 0) {
            n = n / 2;
            msb++;
        }
 
        return (1 << msb);
    }
 
   
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(msb(n));
        sc.close();
    }
}

