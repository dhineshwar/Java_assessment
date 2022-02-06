
public class Volume {
	void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }


public static void main(String args[]) 
{
	Volume ob = new Volume();
	ob.area(7);
	ob.area(10,11);
}
}

