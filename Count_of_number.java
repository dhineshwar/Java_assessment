import java.util.*;
public class Count_of_number {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
                int i;
        for (i=0; i<=N; i++) 
           {
            N= N/10;
            count++;
           }
            {
                System.out.println("the number of digit is "+count);
            }
            }
        }
        
