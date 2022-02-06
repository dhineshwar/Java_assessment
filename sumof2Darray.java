
public class sumof2Darray {
	public static int getSum(int[][] arr) {
		int r=arr.length;
		int sum =0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int result = getSum(arr);
		System.out.println(result);
		}
}
