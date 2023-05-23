import java.util.Scanner;

public class Enunciado4 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		double A, B, C;
				
		System.out.println("INDIQUE O VALOR DA VARIÁVEL 'A' ");
		A = scanner.nextDouble();
		
		System.out.println(" INDIQUE O VALOR DA VARIÁVEL 'B' ");
		B = scanner.nextDouble();
		
		C = B;
		B = A;
		A = C;
		
		System.out.println(" VALOR DA VARIÁVEL 'A' " +A);
		System.out.println(" VALOR DA VARIÁVEL 'B' " +B);

	}

}
