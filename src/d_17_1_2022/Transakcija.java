package d_17_1_2022;

public class Transakcija {
	
//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore

	private int idTransakcije;
	private Racun saKogSePrenose;
	private Racun naKojiSePrenose;
	
	public Transakcija() {
		
	}

	public Transakcija(int idTransakcije, Racun saKogSePrenose, Racun naKojiSePrenose) {
		this.idTransakcije = idTransakcije;
		this.saKogSePrenose = saKogSePrenose;
		this.naKojiSePrenose = naKojiSePrenose;
	}

	public int getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getSaKogSePrenose() {
		return saKogSePrenose;
	}

	public void setSaKogSePrenose(Racun saKogSePrenose) {
		this.saKogSePrenose = saKogSePrenose;
	}

	public Racun getNaKojiSePrenose() {
		return naKojiSePrenose;
	}

	public void setNaKojiSePrenose(Racun naKojiSePrenose) {
		this.naKojiSePrenose = naKojiSePrenose;
	}

	private int provizija(int visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		} else {
			return visinaTransakcije / 100;
		}
	}

	public void izvrsiTransakciju(int visinaTransakcije) {
		if (this.saKogSePrenose.getTrenutnoStanje() >= visinaTransakcije + this.provizija(visinaTransakcije)) {
			this.saKogSePrenose.menjaStanje(visinaTransakcije + this.provizija(visinaTransakcije));
			this.naKojiSePrenose.menjaStanje(-visinaTransakcije);
		}

	}

	public void stampaj() {
		System.out.println(this.idTransakcije);
		System.out.println(this.saKogSePrenose.getImeIPrezime() + " - " + this.saKogSePrenose.getBrojRacuna());
		System.out.println(this.naKojiSePrenose.getImeIPrezime() + " - " + this.naKojiSePrenose.getBrojRacuna());

	}
}
