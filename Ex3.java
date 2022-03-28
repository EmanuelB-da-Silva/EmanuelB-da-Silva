import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
	
	    for(int i = 0; i < num; i++){
	        for(int j = 0; j < num - i; j++){
	            System.out.print("*");
	        }
	        
	        System.out.print("\n");
	    }
	}
	
	
}
