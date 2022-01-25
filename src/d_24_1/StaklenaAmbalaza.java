package d_24_1;

public class StaklenaAmbalaza extends Ambalaza {

//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

private double kaucijaZaFlasu;
private boolean daLiZaFlasuPlacaKaucija;
private double osnovnaCena;

	
@Override
public double cenaArtikla() {
	if(this.daLiZaFlasuPlacaKaucija) {
		return this.osnovnaCena*1.2+this.kaucijaZaFlasu;

	}
	return this.osnovnaCena*1.2;
}

@Override
public void print() {
System.out.println("Bar kod: "+this.barKod+"Naziv artikla: "+this.nazivArtikla+
		"Neto tezina: "+this.netoTezina+"Da li se reciklira: "+this.daLiZaFlasuPlacaKaucija+
		"Osnovna cena: "+this.osnovnaCena+"Cena artikla:"+this.cenaArtikla()+"Kaucija za flasu:"+this.kaucijaZaFlasu);
	
}
	
	


	public StaklenaAmbalaza() {
	super();
	// TODO Auto-generated constructor stub
}

public StaklenaAmbalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina,double kaucijaZaFlasu,
		boolean daLiZaFlasuPlacaKaucija,double osnovnaCena) {
	super(barKod, nazivArtikla, netoTezina, brutoTezina);
	this.kaucijaZaFlasu = kaucijaZaFlasu;
	this.daLiZaFlasuPlacaKaucija = daLiZaFlasuPlacaKaucija;
	this.osnovnaCena = osnovnaCena;
}

	public double getKaucijaZaFlasu() {
	return kaucijaZaFlasu;
}

public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
	this.kaucijaZaFlasu = kaucijaZaFlasu;
}

public boolean isDaLiZaFlasuPlacaKaucija() {
	return daLiZaFlasuPlacaKaucija;
}

public void setDaLiZaFlasuPlacaKaucija(boolean daLiZaFlasuPlacaKaucija) {
	this.daLiZaFlasuPlacaKaucija = daLiZaFlasuPlacaKaucija;
}

public double getOsnovnaCena() {
	return osnovnaCena;
}

public void setOsnovnaCena(double osnovnaCena) {
	this.osnovnaCena = osnovnaCena;
}

	


}
