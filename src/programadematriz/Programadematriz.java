
package programadematriz;

import java.util.Locale;
import java.util.Scanner;


public class Programadematriz {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        
        Integer m,n;
        
        m = read.nextInt();
        n = read.nextInt();
        Integer [][] matr = new Integer [m][n];
        
      
        for(int i=0; i<matr.length; i++)  {
          for(int j=0; j<matr[i].length; j++){
            matr[i][j]=read.nextInt();
            
        }
        }
        
        Integer x = read.nextInt();
        
        for(int i=0; i<matr.length; i++) 		{
        	for (int j=0; j<matr[i].length; j++)	{
        		
        		if(matr[i][j] == x) {
        		System.out.println("position"+i+","+j+":");
        			if(j > 0) {
        				
        				
        				System.out.println("direita"+matr[i][j+1]);
        				
        			}
        			if(j < matr[i].length-1) {
        				
        				
        				System.out.println("esquerda"+matr[i][j-1]);
        				
        			}
        			if(1-matr.length >i) { 
        				
        				System.out.println("down"+matr[i+1][j]);
        			}
        			if(i > 0) { 
        				System.out.println("up"+matr[i-1][j]);
        			}
        			
        			
        		
        		}
        		else {
        			
        			System.out.println("naada");
        
        		}
        		
        	}
        }
        }
        
    }
    

