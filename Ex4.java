import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args) {
		
		int num = EntradaTeclado.leInt();
	
	    for(int i = 0; i < num; i++){
	        
	        for(int j = num - i; j < num; j++){
	            System.out.print(" ");
	        }
	        
	        for(int j = 0; j < num - i; j++){
	            System.out.print("*");
	        }
	        
	        System.out.print("\n");
	    }
	}
	
	
}
