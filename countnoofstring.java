
public class countnoofstring {
	public static void main(String[] args) {
		
	        String s= "i learnt java";
	        int count=0;
	        count=1;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' '){
	                count++;
	            }
	        }
	        System.out.println(count);

	}

}
