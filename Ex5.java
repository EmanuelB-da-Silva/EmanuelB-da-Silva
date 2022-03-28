import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args) throws Exception{

		int num = EntradaTeclado.leInt();
		
		int primo = 1;
		
		for(int i = 1; i < num; i++){
		    for(int j = 1; j < i; j++){
		        if(j != 1 && i % j == 0){
		            break;
		        }
		        else if(j == i - 1){
		            primo = i;
		        }
		    }
		}
		
		System.out.println(primo);
	}
}
