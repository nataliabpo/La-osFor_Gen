package Lista03_DoWhile;

import java.util.Scanner;

public class DoWhile_05 {
	 public static void main(String[] args) {
	        // Declaração de variáveis
	        int numero;
	        int soma = 0;

	        // Leitura dos números
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.println("Digite um número:");
	            numero = scanner.nextInt();

	            // Adição do número à soma, se ele for positivo
	            if (numero >= 0) {
	                soma += numero;
	            }
	            
	        } while (numero != 0);

	        // Impressão do resultado
	        System.out.println("A soma dos números positivos é: " + soma);
	    }
	 
	}


