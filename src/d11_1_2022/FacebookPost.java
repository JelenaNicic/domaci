package d11_1_2022;

public class FacebookPost {

	String imeIPrezimeObjave;
	String ImeIPrezimeKorisnika;
	String tekst;
	int brojLajkova;
	int brojDeljenja;

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
		System.out.println("Ime i prezime osobe koja je objavila tekst: " + this.ImeIPrezimeKorisnika + ">>>>>>"
				+ "Ime i prezime na cijem profilu: " + this.imeIPrezimeObjave);
		System.out.println("Tekst objave: " + this.tekst);
		System.out.println("Likes: " + this.brojLajkova + "Shares: " + this.brojDeljenja);

	}

}
