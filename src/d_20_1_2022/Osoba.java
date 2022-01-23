package d_20_1_2022;

public class Osoba {

//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

protected String imeIPrezime;
protected int jmbg;
protected int godinuRodjenja;

public Osoba() {
	
}
public Osoba(String imeIPrezime, int jmbg, int godinuRodjenja) {
	super();
	this.imeIPrezime = imeIPrezime;
	this.jmbg = jmbg;
	this.godinuRodjenja = godinuRodjenja;
}
public String getImeIPrezime() {
	return imeIPrezime;
}
public void setImeIPrezime(String imeIPrezime) {
	this.imeIPrezime = imeIPrezime;
}
public int getJmbg() {
	return jmbg;
}
public void setJmbg(int jmbg) {
	this.jmbg = jmbg;
}
public int getGodinuRodjenja() {
	return godinuRodjenja;
}
public void setGodinuRodjenja(int godinuRodjenja) {
	this.godinuRodjenja = godinuRodjenja;
}
 
public void print() {
	System.out.println("Ime i prezime: "+this.imeIPrezime+" Jbmg: "+this.jmbg+"Godina rodjenja: "+this.godinuRodjenja);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
