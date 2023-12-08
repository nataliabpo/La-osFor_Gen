package Laco_While;

import java.util.Scanner;

public class LacoWhile_01 {
	
	 public static void main(String[] args) {
	        // Declaração de variáveis
	        int idade;
	        int contadorMenoresDe21 = 0;
	        int contadorMaioresDe50 = 0;

	        // Leitura das idades
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Digite uma idade:");
	            idade = scanner.nextInt();

	            // Verificação se a idade é válida
	            if (idade < 0) {
	                break;
	            }

	            // Atualização dos contadores
	            if (idade < 21) {
	                contadorMenoresDe21++;
	            } else if (idade > 50) {
	                contadorMaioresDe50++;
	            }
	            scanner.close();
	        }

	        // Impressão dos resultados
	        System.out.println("Total de pessoas menores de 21 anos: " + contadorMenoresDe21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + contadorMaioresDe50);
	    }
	
	}


