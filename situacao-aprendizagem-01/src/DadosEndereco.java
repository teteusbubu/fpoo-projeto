
public class DadosEndereco {

	private String cep;
	
	private String lagradouro;
	
	private String numero;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		if (cep.isEmpty()) {
			System.out.println("O CEP NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else {
			if(cep.length()>=3) {
				this.cep = cep;
			}else {
				System.out.println("TEM QUE TER NO MINÍMO 3 LETRAS");
				System.exit(0);
			}
		}
	}
	
	public String getLagradouro() {
		return lagradouro;
	}
	
	public void setLagradouro(String lagradouro) {
		if (lagradouro.isEmpty()) {
			System.out.println("O LAGRADOURO NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else {
			if (lagradouro.length()>=3) {
				this.lagradouro = lagradouro;
			}else {
				System.out.println("TEM QUE TER NO MINÍMO 3 LETRAS");
				System.exit(0);
			}
		}
		
		
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (numero.isEmpty()) {
			System.out.println("O NÚMERO NÃO PODE FICAR VAZIO");
			System.exit(0);
		}
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		if (bairro.isEmpty()) {
			System.out.println("O BAIRRO NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else {
			this.bairro = bairro;
		
		}
	}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			if (cidade.isEmpty()) {
				System.out.println("A CIDADE NÃO PODE FICAR VAZIO");
				System.exit(0);
			}else {
				this.cidade = cidade; }
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			if (estado.isEmpty()) {
				System.out.println("O ESTADO NÃO PODE FICAR VAZIO");
				System.exit(0);
			
			}else {
				if(estado.length()== 2) {
					this.estado = estado;
					}else {
						System.out.println("TEM QUE TER NO MINÍMO 2 LETRAS");
						System.exit(0);
					}
			}
		}
	}
