
public class Add1tobit {
	static int addOneToNum(int x)
    {
        int m = 1;
         
        while( (int)(x & m) >= 1)
        {
            x = x ^ m;
            m <<= 1;
        }
     
        x = x ^ m;
        return x;
    }
     
    public static void main(String[] args)
    {
    	int n=3;
        System.out.println(addOneToNum(n));
    }
}

