
public class LastindexofElementinArray {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};
		int n = 2;
		boolean isPresent=false;
        int pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                isPresent=true;
                pos=i;
            }

        }
        if (isPresent){
            System.out.println("Item is present at "+pos+"  index");
        }
        else{
            System.out.println("Absent");
        }
    }
}

	


