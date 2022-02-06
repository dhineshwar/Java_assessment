
public class evenoddofmatrix {
	public static int even(int arr[][]){
        int even=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2==0){
                    even++;
                }
            }
        }
        return even;
    }
	 public static int odd(int arr[][]){
	        int odd=0;
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr[0].length;j++){
	                if(arr[i][j]%2!=0){
	                    odd++;
	                }
	            }
	        }
	        return odd;
	    }
	    

	public static void main(String[] args) {
	
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int result1 = even(arr);
		System.out.println(result1+ "even");
		int result2 = odd(arr);
		System.out.println(result2+ "odd");
	}

}

