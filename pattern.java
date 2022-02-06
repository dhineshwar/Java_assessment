
public class pattern {
	public static void main(String[] args) {
		// Print the pattern: [*] [[*]] [[[*]]] [[[[*]]]] 
		String s = "[";
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) { 
				System.out.print(s);
			}
			
			System.out.print("*");
			for(int j=0;j<=i;j++) {
				System.out.print("]");
		}
			System.out.println();

	}
}
}

