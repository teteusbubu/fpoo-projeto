import java.util.Scanner;
public class Enunciado2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("####---- LER UMA TEMPERATURA EM GRAUS FAHRENHEIT ----####");

		System.out.println("INFORME A TEMPERATURA FAHRENHEIT:");
		fahrenheit = scanner.nextDouble ();
	    
	    celsius= (fahrenheit -32)/1.8;
	    
	    System.out.println("RESULTADO EM CELSIUS " + celsius);
	    
	    
		
	}

}


