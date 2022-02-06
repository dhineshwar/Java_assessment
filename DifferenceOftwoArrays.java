
public class DifferenceOftwoArrays {
	public static void diffArrays(int a1[], int a2[]) {
		int arr[] =new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			arr[i]= Math.abs(a1[i]-a2[i]);
		}
		for(int i=0;i<a1.length;i++) {
		System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,4,5,6,7};
		int[] a2= {1,3,5,7,9,2,3};
		diffArrays(a1,a2);

	}

}

