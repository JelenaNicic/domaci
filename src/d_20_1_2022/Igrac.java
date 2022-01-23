package d_20_1_2022;

public class Igrac extends Osoba {
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	public int broj;
	public String pozicija;
	public boolean kapiten;
	public Igrac() {
		
	}
	public Igrac(String imeIPrezime, int jmbg, int godinuRodjenja,int broj,String pozicija,boolean kapiten) {
		super(imeIPrezime, jmbg, godinuRodjenja);
		this.broj=broj;
		this.pozicija=pozicija;
		this.kapiten=kapiten;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	

	public void print () {
		super.print();
System.out.println("Broj koji igrac nosi: "+this.broj+" Pozicija na kojoj igra: "+this.pozicija+"Kapiten: "+this.kapiten);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
