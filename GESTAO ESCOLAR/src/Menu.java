import java.util.Scanner;

public class Menu {

	Professor objProfessor;
	Aluno objAluno;
	Diciplina objDisciplina;
	Media objMedia;
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao != 6) {
		
		System.out.println("ESCOLHA UMA OPÇÃO PELO NÚMERO:");
		System.out.println("1 - CADASTRAR PROFESSOR");
		System.out.println("2 - CADASTRAR ALUNO");
		System.out.println("3 - CADASTRAR DISCIPLINA");
		System.out.println("4 - CADASTRAR NOTAS");
		System.out.println("5 - EXIBIR DADOS");
		System.out.println("6 - SAIR");
		
		opcao = objScanner.nextInt();
		
				
		switch (opcao) {
		case 1:
			System.out.println("DIGITE O NOME DO PROFESSOR(A): ");
			objProfessor = new Professor();
			objProfessor.setNomeProfessor(objScanner.next());
			break;
			
		case 2:
			System.out.println("DIGITE O NOME DO ALUNO(A): ");
			objAluno = new Aluno();
			objAluno.setNomeAluno(objScanner.next());
			break;
			
		case 3:
			System.out.println("DIGITE O NOME DA DISCIPLINA: ");
			objDisciplina = new Diciplina();
			objDisciplina.setNomediciplina(objScanner.next());
			break;
			
		case 4:
			System.out.println("DIGITE AS NOTAS: ");
			objMedia = new Media();
			
			System.out.println("NOTA 1");
			objMedia.setNota1(objScanner.nextFloat());
			
			System.out.println("NOTA 2");
			objMedia.setNota2(objScanner.nextFloat());
			
			System.out.println("NOTA 3");
			objMedia.setNota3(objScanner.nextFloat());
			
			System.out.println("NOTA 4");
			objMedia.setNota4(objScanner.nextFloat());
			break;
			
		case 5:
			System.out.println("EXIBIR DADOS: ");
			System.out.println("PROFESSOR: " + objProfessor.getNomeProfessor());
			System.out.println("ALUNOS: " + objAluno.getNomeAluno());
			System.out.println("DISCIPLINA: " + objDisciplina.getNomediciplina());
			System.out.println("MÉDIA: " + objMedia.calcularMedia());
			break;
			
		case 6:
			System.out.println("#### OBRIGADO POR USAR O SISTEMA! ####");
			break;
			
			default:
			System.out.println("OPÇÃO INVÁLIDA!");
			break;
			
			}//FIM DO SWITCH
		
		}//FIM DO WHILE
		
	}//FIM DO MÉTODO exibirMenu()
	
}//FIM DA CLASSE Menu
