package d10_1_2022;

public class Proizvod {
////	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:

	
	String naziv;
	double cena;
	double tezina;
	
	////stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

	public void naziv() {
		System.out.println("Naziv"+ this.naziv);
	}
	
	public void cena() {
		System.out.println("Cena"+this.cena);
	}
	public void tezina() {
		System.out.println("Tezina"+this.tezina);
	}

	
}


