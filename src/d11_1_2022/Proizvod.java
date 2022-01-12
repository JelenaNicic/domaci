package d11_1_2022;

public class Proizvod {
////	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:

	
	String naziv;
	double cena;
	double tezina;


	public void stampaj() {
		System.out.println("Naziv: "+ this.naziv+" Cena: "+this.cena+" Tezina: "+this.tezina);
	}
	
	
	public void povecajCenu(int povecanje) {
		this.cena=this.cena+povecanje;
	}
	public double vratiCenuSaPopustom(int popust) {
		double cenaSaPopustom;
		return cenaSaPopustom=this.cena-popust;
	     }
	
	public int racunajPostarinu() {
		int cenaPostarine=0;
	
		if(this.tezina<100) {
			cenaPostarine=200;	
		}else if(this.tezina<500){
			cenaPostarine=400;
		}else {
			cenaPostarine=1000;
		}
		return cenaPostarine;
	}
}


