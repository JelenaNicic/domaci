package d_24_1;

public class Tetrapak extends Ambalaza {

	
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean daLiSeReciklira;
	private double osnovnaCena;
	
	
	
	
	
	
	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina,boolean daLiSeReciklira,int osnovnaCena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		this.daLiSeReciklira=daLiSeReciklira;
		this.osnovnaCena=osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(this.daLiSeReciklira) {
		return	this.tezinaPakovanja()*1.5+this.osnovnaCena;
		}
		return this.osnovnaCena;
	}

	@Override
	public void print() {
		System.out.println("Bar kod: "+this.barKod+"Naziv artikla: "+this.nazivArtikla+"Neto tezina: "+this.netoTezina
		+"Da li se reciklira: "+this.daLiSeReciklira+"Cena: "+this.cenaArtikla());
	}

}





