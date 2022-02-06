
public class maxofcolomn {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,8,6},{6,5,9}};
		int max=0;
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++){
            if(max<arr[i][j])
                max=arr[j][i];            
        }
        System.out.println(max);
    	}
	
	}

}




