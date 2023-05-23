import java.util.Scanner;

public class Enunciado1 {

	public void Enunciado1(); {
		
		Scanner objScanner = new Scanner(System.in);
		int sentinela = 0;
		int soma = 0;
		
		while(sentinela > 0); {
			System.out.println("DIGITE O VALOR: ");
			sentinela = objScanner.nextInt();
			
			soma = soma + sentinela;
		}
		
		System.out.println("O RESULTADO DA SOMA É:"+ soma);
		
	}
}