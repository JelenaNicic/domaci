package d_24_1;

import java.util.ArrayList;

public class Korpa {
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze)
//, kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

	
	
	
	
	ArrayList<Ambalaza> niz = new ArrayList<Ambalaza>();

	private double cenaSvihASaPopustom(int popust) {
		double suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma = suma + this.niz.get(i).cenaArtikla();
		}
		return suma - popust;
	}

	public double ukupnaCena(SuperKartica kartica) {
		return this.cenaSvihASaPopustom(kartica.getPopust());

	}

	public void dodajAmbalazu(Ambalaza ambalaza) {
		niz.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < niz.size(); i++) {
			if (niz.get(i).barKod.equals(barkod)) {
				this.niz.remove(i);
			}

		}
	}
}
