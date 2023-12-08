package Lista01;
import java.util.Scanner;
public class LacoFor_02 {

	public static void main(String[] args) {
	
	
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;

        // Leitura dos números
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numero = scanner.nextInt();

            // Verificação se o número é par
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        	
        }

        // Impressão dos resultados
        System.out.println("Total de números pares: " + contadorPares);
        System.out.println("Total de números ímpares: " + contadorImpares);
    }


}
