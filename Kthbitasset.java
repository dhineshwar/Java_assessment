import java.util.*;
public class Kthbitasset {
	static int setKthBitAsSet(int n, int k)
	{
	    return ((1 << k) | n);
	}

	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), k = sc.nextInt();
	    System.out.print("Kth bit set number = " +  setKthBitAsSet(n, k));
	sc.close();
	}
}

