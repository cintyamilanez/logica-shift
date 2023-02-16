

import java.util.Scanner;

public class MultaDeTransito {

	public static void main(String[] args) {
		//Crie um programa Java que leia a velocidade de um carro e a velocidade máxima para a via: 
			// 1. Informe 50 reais se estiver até 10km/h acima; 
			// 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
			// 3. Informe 300 reais se estiver acima de 31km/h acima.
		
		int velocidadeCarro, velocidadeMaxima;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a velocidade do carro?");
		velocidadeCarro = scanner.nextInt();
		
		System.out.println("Qual a velocidade máxima da via?");
		velocidadeMaxima = scanner.nextInt();
		
		var diferencaVelocidade = velocidadeCarro - velocidadeMaxima;
		
		if (diferencaVelocidade > 0 & diferencaVelocidade <= 10) {
			System.out.println("A multa é R$ 50,00!");
		} else if (diferencaVelocidade >= 11 & diferencaVelocidade <= 30) {
			System.out.println("A multa é R$ 100,00!");
		} else if (diferencaVelocidade >= 31) {
			System.out.println("A multa é R$ 300,00!");	
		} else {
			System.out.println("Sem multa!");
		}
		
		scanner.close();
	}

}
