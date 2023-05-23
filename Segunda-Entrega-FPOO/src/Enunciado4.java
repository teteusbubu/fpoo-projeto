
public class Enunciado4 {

	int n1;
	int resto;
	
	public void MaiorQueZero() {
		
	if(getN1() > 0) {
		Resto();
	if(resto == 0) {
		System.out.println("PAR");
	}else {
		System.out.println("IMPAR");
	}
	}else {
		System.out.println("DIGITE UM VALOR MAIOR QUE ZERO");
	}
	}
	public void Resto(){
		resto = (getN1() % 2);
		}
		


	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getResto() {
		return resto;
	}

	public void setResto(int resto) {
		this.resto = resto;
	}
}

	