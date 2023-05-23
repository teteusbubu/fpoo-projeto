import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado1 objEnunciado = new Enunciado1();
		Enunciado2 objEnunciado2 = new Enunciado2();
		Enunciado3 objEnunciado3 = new Enunciado3();
		Enunciado4 objEnunciado4 = new Enunciado4();
		Enunciado5 objEnunciado5 = new Enunciado5();
		
		/*int n1, n2;
		
		System.out.println("INFORME O PRIMEIRO NUMERO:");
		n1 = objScanner.nextInt();
		
		System.out.println("INFORME O SEGUNDO NUMERO:");
		n2 = objScanner.nextInt();
		
		objEnunciado.exibirMaior(n1, n2);*/
		/*int n1, n2, n3;
		
		System.out.println("INFORME O PRIMEIRO NUMERO:");
		n1 = objScanner.nextInt();
		
		System.out.println("INFORME O SEGUNDO NUMERO:");
		n2 = objScanner.nextInt();
		
		System.out.println("INFORME O TERCEIRO NUMERO:");
		n3 = objScanner.nextInt();
		
		objEnunciado2.teste1(n1 ,n2 ,n3 );
		*/
		
		        //ENUNCIADO3//
		
		/*System.out.println("INFORME A PRIMEIRA NOTA:");
		objEnunciado3.setN1(objScanner.nextDouble());
		
		System.out.println("INFORME A SEGUNDA NOTA:");
		objEnunciado3.setN2(objScanner.nextDouble());
		
		System.out.println("INFORME A TERCEIRA NOTA:");
		objEnunciado3.setN3(objScanner.nextDouble());
		
		System.out.println("INFORME A QUARTA NOTA:");
		objEnunciado3.setN4(objScanner.nextDouble());
		
		if(objEnunciado3.media1() >=7 ) {
			
			objEnunciado3.CalcularMedia();
		}else {
			System.out.println("INFORME A QUINTA NOTA: ");
			objEnunciado3.setN5(objScanner.nextDouble());
		}
		objEnunciado3.CalcularMedia2();*/
		
		//ENUNCIADO4//
		
		/*System.out.print("INFORME O VALOR");
		objEnunciado4.setN1(objScanner.nextInt());
		
		objEnunciado4.MaiorQueZero();*/
		
		//ENUNCIADO//
		System.out.println("INFORME O PRIMEIRO NÚMERO");
		objEnunciado5.setN1(objScanner.nextInt());
		
		System.out.println("INFORME O SEGUNDO NÚMERO");
		objEnunciado5.setN2(objScanner.nextInt());
		
		System.out.println("INFORME O OPERADOR NÚMERO");
		objEnunciado5.setOperador(objScanner.next());
		
		objEnunciado5.calculadora();
		
		System.out.println("RESULTADO: "+ objEnunciado5.getResultado() );
		}
	}
		
		