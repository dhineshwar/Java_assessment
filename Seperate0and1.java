
public class Seperate0and1 {
	public static int separatezerosandones(int arr[], int size) {
		// TODO Auto-generated method stub
		int l=0,r=size-1,count=0;
		while(l<r) {
			while(arr[l]==0)
				l+=1;
			while(arr[r]==1)
				r-=1;
			if(l<r) {
				swap(arr,l,r);
				count+=1;
			}
		}
return count;
	}
	public static void swap(int[] arr, int l, int r) {
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	public static void printArray(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,1,0,0,1,0,0,1};
		int s = arr.length;
		separatezerosandones(arr, s);
		printArray(arr, s);
		
}
}
