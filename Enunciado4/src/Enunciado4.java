import java.util.Scanner;

public class Enunciado4 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		double A, B, C;
				
		System.out.println("INDIQUE O VALOR DA VARI�VEL 'A' ");
		A = scanner.nextDouble();
		
		System.out.println(" INDIQUE O VALOR DA VARI�VEL 'B' ");
		B = scanner.nextDouble();
		
		C = B;
		B = A;
		A = C;
		
		System.out.println(" VALOR DA VARI�VEL 'A' " +A);
		System.out.println(" VALOR DA VARI�VEL 'B' " +B);

	}

}
