
public class DadosPessoais {
	
	private String nome;
	private String sobrenome;
	private String datanascimento;
	private String genero;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			System.out.println("NOME É OBRIGATÓRIO");
		}else {
			int tamanho = nome.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES:");
			}else {
				this.nome = nome;
			}
		}
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		if(sobrenome.isEmpty()) {
			System.out.println("NOME É OBRIGATÓRIO");
		}else {
			int tamanho = sobrenome.length();
			if(tamanho < 3) {
				System.out.println("MINIMO DE TRÊS CARACTERES:");
			}else {
				
			}
			this.sobrenome = sobrenome;
		}
	}
	
	public String getDatanascimento() {
		return datanascimento;
	}
	
	public void setDatanascimento(String datanascimento) {
		if(datanascimento.isEmpty()) {
			System.out.println("NOME É OBRIGATÓRIO");
		}else {
			int tamanho = datanascimento.length();
			if(tamanho < 10) {
				System.out.println("MINIMO DE TRÊS CARACTERES:");
			}else {
				
			}
			this.datanascimento = datanascimento;
		}	
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		if(datanascimento.isEmpty()) {
			System.out.println("NOME É OBRIGATÓRIO");
		}else {
			if(genero.equalsIgnoreCase("feminino")) {
				this.genero = genero;
			}else {
				if(genero.equalsIgnoreCase("masculino")) {
						this.genero = genero;
					}else {
						if(genero.equalsIgnoreCase("outros")) {
							this.genero = genero;
						}else {
							System.out.println("MINIMO DE TRÊS CARACTERES:");
							this.genero = genero;
			}
					}
			}
		}
	}
}
