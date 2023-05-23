import java.util.Scanner;
public class Menu {
	
	DadosPessoais objDadosPessoais;
	DadosContato objDadosContato;
	DadosEndereco objDadosEndereco;
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao !=5 ) {
			
			System.out.println("ESCOLHA UMA OPÇÃO PELO NÚMERO:");
			System.out.println("1 - DADOS PESSOAIS");
			System.out.println("2 - DADOS DE CONTATO");
			System.out.println("3 - DADOS DE ENDERECO");
			System.out.println("4 - EXIBIR DADOS");
			System.out.println("5 - SAIR");
			
			opcao = objScanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				objDadosPessoais = new DadosPessoais();
				
				System.out.println("INFORME UM NOME");
				objDadosPessoais.setNome(objScanner.next());
				
				System.out.println("INFORME UM SOBRENOME");
				objDadosPessoais.setSobrenome(objScanner.next());
				
				System.out.println("INFORME UMA DATA DE NASCIMENTO");
				objDadosPessoais.setDatanascimento(objScanner.next());
				
				System.out.println("INFORME O GÊNERO");
				objDadosPessoais.setGenero(objScanner.next());
				
				break;
			
			case 2:
				objDadosContato = new DadosContato();
				
				System.out.println("INFORME O E-MAIL");
				objDadosContato.setEmail(objScanner.next());
				
				System.out.println("INFORME O TELEFONE");
				objDadosContato.setTelefone(objScanner.next());
				
				break;
			
			case 3:
				objDadosEndereco = new DadosEndereco();
				
				System.out.println("INFORME O CEP");
				objDadosEndereco.setCep(objScanner.next());
				
				System.out.println("INFORME O LOGRADOURO");
				objDadosEndereco.setLagradouro(objScanner.next());
				
				System.out.println("INFORME O BAIRRO");
				objDadosEndereco.setLagradouro(objScanner.next());
				
				System.out.println("INFORME A CIDADE");
				objDadosEndereco.setCidade(objScanner.next());
				
				System.out.println("INFORME O ESTADO");
				objDadosEndereco.setEstado(objScanner.next());
				
				break;	
			
			case 4:
				System.out.println("EXIBIR DADOS PESSOAIS: ");
				System.out.println("NOME: " + objDadosPessoais.getNome());
				System.out.println("SOBRENOME: " + objDadosPessoais.getSobrenome());
				System.out.println("DATA DE NASCIMENTO: " + objDadosPessoais.getDatanascimento());
				System.out.println("GÊNERO: " + objDadosPessoais.getGenero());
				
				System.out.println("EXIBIR DADOS DE CONTATO: ");
				System.out.println("E-MAIL: " + objDadosContato.getEmail());
				System.out.println("TELEFONE: " + objDadosContato.getTelefone());
				
				System.out.println("EXIBIR DADOS DE ENDEREÇO: ");
				System.out.println("CEP:" + objDadosEndereco.getCep());
				System.out.println("LOGRADOURO: " + objDadosEndereco.getLagradouro());
				System.out.println("NÚMERO DA CASA: " +  objDadosEndereco.getNumero());
				System.out.println("BAIRRO: " +  objDadosEndereco.getBairro());
				System.out.println("CIDADE: " +  objDadosEndereco.getCidade());
				System.out.println("ESTADO: " +  objDadosEndereco.getEstado());	
				
				break;
		
			case 5:
				System.out.println("### OBRIGADO POR USAR O SISTEMA### ");
				break;
			
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
				break;
			}
		}
	}
}
