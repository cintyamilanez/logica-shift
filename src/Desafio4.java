import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		// Pega o numero de alunos:
		Scanner leitor= new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos:");
		int quantidadeAlunos = leitor.nextInt();
		
		// Executa o codigo pra cada aluno informado comparando com o contador:
		int contador = 0; 
		float totalNotas = 0;
		while (contador < quantidadeAlunos) {
			
			// Captura e soma todas as notas:
			System.out.println("Informe a nota do aluno " + (contador + 1) + ":");
			totalNotas+= leitor.nextFloat();
			
			// Acrescenta ao contador:
			contador++;
		}
		
		// Imprime a média:
		System.out.println("A média da sala é: " + (totalNotas / quantidadeAlunos));
	}
 
}
