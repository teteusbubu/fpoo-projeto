import java.util.Scanner;
public class Enunciado1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("####---- LER UMA TEMPERATURA EM GRAUS CELSIUS ----####");

		System.out.println("INFORME A TEMPERATURA CELSIUS:");
	    celsius = scanner.nextDouble ();
	    
	    fahrenheit= (celsius * 1.8 + 32);
	    
	    System.out.println("RESULTADO EM FAHREINHEIT " + fahrenheit);
	    
	    
		
	}

}
