import java.util.Scanner;

public class RotateNitroN {
	
	public static void rotateArray(int[][] Array){
	        int row = Array.length;
	        for (int i = 0; i < row; i++){
	            for (int j = i; j < row; j++){
	                int temp = Array[i][j];
	                Array[i][j] = Array[j][i];
	                Array[j][i] = temp;
	            }

	        }
	    
	        for (int i = 0; i< row; i++){
	            for(int j = 0; j< row/2; j++){
	                int temp = Array[i][j];
	                Array[i][j] = Array[i][row - 1 - j];
	                Array[i][row - 1 - j] = temp;
	            }
	        }

	    }
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int columns=sc.nextInt();    
	        
	       int twoD[][]=new int[rows][columns];
	         for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                twoD[i][j]=sc.nextInt();
	            }
	         }
	        
	        rotateArray(twoD);
	            for (int i = 0; i < twoD.length; i++){
	            for (int j = 0; j < twoD.length; j++){
	                System.out.print(twoD[i][j] + " ");
	            }
	            System.out.println();
	        }
	            sc.close();
	    }
	}

