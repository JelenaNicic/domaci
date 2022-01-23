package d_21_1_2022;

import java.util.ArrayList;

public abstract class Radnik {

//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String imeIPrezime;
	protected ArrayList<Sektor>sektori=new ArrayList<Sektor>();
	
	public abstract double plata();
	
	public void zaposliSe(Sektor sektor) {
		this.sektori.add(sektor);
	}

	public Radnik() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
	
	
	
	
	
	
	
	
	
	
}
