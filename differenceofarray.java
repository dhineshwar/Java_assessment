
public class differenceofarray {
	public static void diffArrays(int a1[][], int a2[][]) {
		int r = a1.length;
		int arr[][] =new int[r][r];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
			arr[i][j]= Math.abs(a1[i][j]-a2[i][j]);
			}
		}
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
		System.out.print(arr[i][j] + " ");
		}
		}
	}
	public static void main(String[] args) {
		
		int[][] a1= {{1,2,3},{4,5,6}};
		int[][] a2= {{9,8,7},{6,5,4}};
		diffArrays(a2,a1);
		}
}

