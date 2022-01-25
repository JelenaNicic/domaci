package d_24_1;

public abstract class Ambalaza {
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj

	protected String barKod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
	
	public Ambalaza() {
		
	}
	
	public Ambalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina) {
		super();
		this.barKod = barKod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
 public double tezinaPakovanja() {
	 return this.brutoTezina-this.netoTezina;
 }
	
	public abstract double cenaArtikla();
	
	public abstract void print();
	
}
