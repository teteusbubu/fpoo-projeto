
public class Enunciado5 {

	String operador;
	int n1;
	int n2;
	int resultado;	
	
	public void calculadora() {
		switch(getOperador()) {
		case"+" : 
			resultado = getN1() + getN2();
			break;
		case"-" : 
			resultado = getN1() - getN2();
			break;
		case"*" : 
			resultado = getN1() * getN2();
			break;
		case"/" : 
			resultado = getN1() / getN2();
			break;
		case"%": 
			resultado = getN1() % getN2();
			break;
		}
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
