import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner objScan = new Scanner(System.in);
		
		Triangulo objTri = new Triangulo();
		
		System.out.println("--Bem-Vindo--");
		
		System.out.println("Informa o lado1: ");
		objTri.setLado1(objScan.nextInt());
		
		System.out.println("Informa o lado2: ");
		objTri.setLado2(objScan.nextInt());
		
		System.out.println("Informa o lado3 ");
		objTri.setLado3(objScan.nextInt());
		
		objTri.Triangulo();
		
	}

}
					