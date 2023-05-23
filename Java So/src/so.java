
public class so {

	public static void main(String[] args) {
		
		System.out.println("Nome do Sistema Operacional" + System.getProperty("os.name"));

		System.out.println("Arquitetura do sistema operacional"+ System.getProperty("os.arch"));
	 
		System.out.println("Versao do sistema operacional"+ System.getProperty("os.version"));
	
		System.out.println("Serparador de arquivos"+ System.getProperty("path.separator"));
	
		System.out.println("Separador de linhas"+ System.getProperty("line.separator"));
	
		System.out.println("Home de usuario"+ System.getProperty("user.home"));
	
		System.out.println("Diretorio corrente de trabalho"+ System.getProperty("user.dir"));
		
	}
	

}
