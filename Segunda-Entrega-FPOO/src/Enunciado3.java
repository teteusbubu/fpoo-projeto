
public class Enunciado3 {

	private double N1;
	private double N2;
	private double N3;
	private double N4;
	private double N5;
	private double media1;
	private double media2;
		public void CalcularMedia() {
			if(media1() >= 7 ) {
				System.out.println("APROVADO");
			}
		}
		
		public void CalcularMedia2() {
			if(media2() >=7) {
				System.out.println("APROVADO");
			}else {
				System.out.println("REPROVADO");
			}
		}
		public double media1() {
			media1 = (getN1()+ getN2()+ getN3()+ getN4())/4;
			return media1;
		}
		public double media2() {
			media1 = (getN1()+ getN2()+ getN3()+ getN4()+ getN5())/5;
			return media1;
		
	}
		public double getN1() {
			return N1;
		}
		
		public void setN1(double n1) {
			N1 = n1;
		}
		
		public double getN2() {
			return N2;
		}
		
		public void setN2(double n2) {
			N2 = n2;
		}
		public double getN3() {
			return N3;
		}
		
		public void setN3(double n3) {
			N3 = n3;
		}
		public double getN4() {
			return N4;
		}
		
		public void setN4(double n4) {
			N4 = n4;
		}
		public double getN5() {
			return N5;
		}
		
		public void setN5(double n5) {
			N5 = n5;
		}
}

