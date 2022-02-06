
public class matrixissparse {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{0,3,0},{0,0,4}};
		int temp =0;
    	for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	if(arr[i][j] == 0) {
            		temp++;
            	}
            }
    	}
    	if(temp>9/2)
    		System.out.print("Matrix is sparse");
    	else
    		System.out.print("Matrix is not a sparse one");
    	

	}

}


