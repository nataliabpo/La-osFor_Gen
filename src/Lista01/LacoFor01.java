package Lista01;
import java.util.Scanner;
public class LacoFor01 {

	public static void main(String[] args) {
		 int primeiroNumero;
	        int ultimoNumero;

	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o primeiro número do intervalo:");
	        primeiroNumero = scanner.nextInt();
	        System.out.println("Digite o último número do intervalo:");
	        ultimoNumero = scanner.nextInt();

	     
	        if (primeiroNumero > ultimoNumero) {
	            System.out.println("Intervalo inválido!");
	            System.exit(0);
	        }

	        int i = primeiroNumero;
	        while (i <= ultimoNumero) {
	          
	            if (i % 3 == 0 && i % 5 == 0) {
	              
	                System.out.println(i + " é múltiplo de 3 e 5");
	            }

	  
	            i++;
	        }
	    	
	    	scanner.close();
	    }



	}


