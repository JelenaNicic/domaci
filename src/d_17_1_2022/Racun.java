package d_17_1_2022;

public class Racun {
	
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
//		

	private String BrojRacuna;
	private String imeIPrezime;
	private int trenutnoStanje;
	
	public String getBrojRacuna() {
		return BrojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		BrojRacuna = brojRacuna;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public void menjaStanje(int prosledjenaVrednost) {
		this.trenutnoStanje=this.trenutnoStanje-prosledjenaVrednost;
		
	}
	
	public void print () {
		System.out.println("Ime i prezime: "+this.imeIPrezime+"Trenutno stanje"+this.trenutnoStanje+" rsd");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
