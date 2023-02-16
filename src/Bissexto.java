

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		// Fa�a um programa que escreva se um ano informado pelo usu�rio � bissexto ou n�o. 
		// Um ano � bissexto quando � (divis�vel por 400) ou � (divis�vel por 4 e n�o por 100).
		
		int ano;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano:");
		ano = scanner.nextInt(); 
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " � um ano Bissexto!");
		}
		else{
			System.out.println(ano + " n�o � um ano Bissexto!");
		}
	}

}
