import java.util.Scanner;

public class Nomes {

	String[] Nomes = new String [10];
	Scanner objScanner = new Scanner (System.in);
	
	public void ArmazenarNomes() {
	
	for(int indice = 0; indice < Nomes.length; indice++){
		System.out.println("digite o nome" + (indice + 1));
		Nomes[indice] = objScanner.next();
	}
	
	System.out.println("LISTAGEM DE NOME: ");
	
	int indice = 0;
	while(indice < Nomes.length) {
	System.out.println((indice + 1 ) + "º nome:" + Nomes[indice]);
	indice++;
	
		}
	}
}