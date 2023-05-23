

import java.util.Scanner;


public class Enunciado3 {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		double tempo, velocidade = 0, litrosUsados, distancia;
		
		System.out.println("Bem vindo ao conversor");
		
		System.out.println("Digite o tempo gasto para a viagem:");
		tempo = scanner.nextDouble();
		
		System.out.println("Digite a velocidade gasta para a viagem:");
		velocidade = scanner.nextDouble();
		
		distancia = velocidade * tempo;
		
		litrosUsados= distancia/12;
		
		System.out.println("Velocidade média:  "+velocidade);
		
		System.out.println("Tempo gasto na viagem:" + tempo );
	
		System.out.println("Distancia percorrida: " + distancia );
	
		System.out.println("Quantidade de litros gatos na viagem: " + litrosUsados );

		System.out.println(" Muito obrigado por utilizar o conversor");
		
	}

}






