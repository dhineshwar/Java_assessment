
public class Binarytodecimal {
	static int binarytodecimal(int n) {
		int num= n;
		int decimal=0;
		int base = 1;
		int temp = num;
		while(temp>0) {
			int last_digit = temp%10;
			temp /= 10;
			decimal += last_digit*base;
			base*=2;
		}
		return decimal;
	}

	public static void main(String[] args) {
			int n=1000;
		System.out.println(binarytodecimal(n));
	}

}
