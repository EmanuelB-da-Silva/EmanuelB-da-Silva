import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args) {

		double num = EntradaTeclado.leDouble();
		
		double min = num;
		double max = num;
		
		while(num != 0){
		    num = EntradaTeclado.leDouble();
		    
		    if(num != 0 && num < min){
		        min = num;
		    }
		    else if(num > max){
		        max = num;
		    }
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
