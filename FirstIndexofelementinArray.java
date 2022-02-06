
public class FirstIndexofelementinArray {
	public static int firstIndex(int num[],int n){
        int pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                pos=i;
                break;
            }

        }
        return pos;
    }
    public static void main(String[] args) {
        int a[] = {1,2,5,4,5,6,7,8,9};
        int n=5;
       
        System.out.println(firstIndex(a,n));
    }
}

