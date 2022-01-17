package d_13_11_2022;

import d11_1_2022.FacebookPost;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacebookPost r = new FacebookPost();
		r.setImeIPrezimeKorisnika("Milan Markovic");
		r.setImeIPrezimeKorisnika("Saska Mitrovic");;
		r.setTekst("Cao");
		r.getbrojDeljenja();
		r.getbrojLajkova();

		r.like();
		r.share();
		r.dislike();
		r.print();

		System.out.println("Ime osobe koja je korisnik: " + r.getimeIPrezimeKorisnika()
				+ " Ime osobe koja je objavila: " + r.getImeIPrezimeObjave());
		System.out.println("Tekst poruke: " + r.getTekst());
		System.out.println("Broj lajkova: " + r.getbrojLajkova() + " Broj deljenja: " + r.getbrojDeljenja());

		FacebookPost w = new FacebookPost();
		w.setImeIPrezime("Katarina Milenkovic ");
		w.setImeIPrezimeKorisnika("Aca Milosevic ");
		w.setTekst("Pozdrav");

		w.print();

		FacebookPost n = new FacebookPost("Milena Nikolic", "Andrijana Milic", "Hello", 8, 30);
		n.print();

	}



	}


