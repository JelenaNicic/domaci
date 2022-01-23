package d_20_1;

import java.util.ArrayList;

public class Igrac extends Osoba {

	public Igrac() {
		
	}
	public int broj;
	public String pozicija;
	public ArrayList<Karton>niz=new ArrayList<Karton>();
	public boolean kapiten;
	
	public Igrac(String imeIPrezime, String jmbg, int godRodj, int broj, String pozicija,boolean kapiten) {
		super(imeIPrezime, jmbg, godRodj);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
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
    public ArrayList<Karton> getNiz() {
		return niz;
	}
    public void setNiz(ArrayList<Karton> niz) {
		this.niz = niz;
	}
    public boolean isKapiten() {
		return kapiten;
	}
    public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
    public void dodajKarton(Karton karton) {
		niz.add(karton);
	}
    public int brojZutih() {
    	int brojac=0;
    	for (int i = 0; i <niz.size(); i++) {
    	if(this.niz.get(i).getTipkartona().equals("zuti")) {
    			brojac=brojac+1;
    		}
		
		}
    	return brojac;
    }
    public int brojCrvenih() {
    	int brojac=0;
    	for (int i = 0; i <niz.size(); i++) {
    	if(this.niz.get(i).getTipkartona().equals("crveni")) {
    			brojac=brojac+1;
    		}
		
		}
    	return brojac;
    
    }
    
    
     public void print() {
    	super.print();
    	System.out.println("Unesite broj: "+this.broj+" Unesite poziciju: "+this.pozicija+
    			"Unesite da li je igrac kapiten: "+this.kapiten);
    
    		
			
		}
    }
		
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//}
