
public class MinMaxArray {

	public static void main(String[] args) {
			 int arr[] = {46, 17, 41, 52, 63, 668, 44, 10, 46,447};
			  int min = Integer.MAX_VALUE;  
			  int max = Integer.MIN_VALUE;  
			  
			  for(int i=0; i<arr.length ;i++)
			  {
				  if(arr[i] < min)
			      min = arr[i];
			     if(arr[i] > max)
			       max = arr[i];
			   }
			   System.out.println("Min:" + min+" "+ "Max:" + max);
		}


}


