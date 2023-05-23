
public class DadosContato {

	private String Email;
	private String telefone;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		if(email.isEmpty()) { 
			System.out.println("EMAIL É OBRIGATÓRIO");
			System.exit(0);
		}else{
			this.Email = email; 
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone.isEmpty()) {
			System.out.println("TELEFONE É OBRIGATÓRIO");
			System.exit(0);
	
			int tamanho = telefone.length();
			if( tamanho == 14) {
			}else {
				System.out.println("APENAS QUATORZE CARACTERES");
				System.exit(0);
				
			}	
		}
		this.telefone = telefone;
	}
}
