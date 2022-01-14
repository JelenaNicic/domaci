package d11_1_2022;

public class FacebookPost {
//  Od gettera i settera:
//		  korisnik moze da procita bilo koji atribut 
//		  ali ne moze da menja broj lajkova 	i broj deljenja (nemamo settere za ove atribute)
//		   Konstruktore:
//		  	konstruktori koji su potrebni i logicni

	String imeIPrezimeObjave;
	String imeIPrezimeKorisnika;
	String tekst;
	int brojLajkova;//// samo get
	int brojDeljenja;//// samo get

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezimeObjave, String imeIPrezimeKorisnika, String tekst, int brojLajkova,
			int brojDeljenja) {
		this.imeIPrezimeObjave = imeIPrezimeObjave;
		this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
		this.tekst = tekst;
		this.brojLajkova = brojLajkova;
		this.brojDeljenja = brojDeljenja;

	}

	public String getImeIPrezimeObjave() {
		return this.imeIPrezimeObjave;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezimeObjave = imeIPrezime;
	}

	public String getimeIPrezimeKorisnika() {
		return this.imeIPrezimeKorisnika;
	}

	public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
		this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
	}

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getbrojDeljenja() {
		return this.brojDeljenja;
	}

	public int getbrojLajkova() {
		return this.brojLajkova;
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		this.brojLajkova = this.brojLajkova - 1;
		if (this.brojLajkova == 0) {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println("Ime i prezime osobe koja je objavila tekst: " + this.imeIPrezimeKorisnika + ">>>>>>"
				+ "Ime i prezime na cijem profilu: " + this.imeIPrezimeObjave);
		System.out.println("Tekst objave: " + this.tekst);
		System.out.println("Likes: " + this.brojLajkova + "Shares: " + this.brojDeljenja);

	}

}
