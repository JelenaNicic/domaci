package d11_1_2022;

public class zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacebookPost r = new FacebookPost();
		r.imeIPrezimeKorisnika = "Milan Markovic";
		r.imeIPrezimeObjave = "Saska Mitrovic";
		r.tekst = "CAO";
		r.brojDeljenja = 5;
		r.brojLajkova = 50;

	r.like();
	r.share();
	r.dislike();
	r.print();
		
System.out.println("Ime osobe koja je korisnik: "+ r.getimeIPrezimeKorisnika()+" Ime osobe koja je objavila: " +r.getImeIPrezimeObjave() );
		System.out.println("Tekst poruke: "+r.gettekst());
		System.out.println("Broj lajkova: " +r.getbrojLajkova()+" Broj deljenja: "+r.brojDeljenja);
		
	
	}

	
	}


