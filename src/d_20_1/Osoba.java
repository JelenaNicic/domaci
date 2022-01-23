package d_20_1;

public class Osoba {
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
//
//
	
  protected String imeIPrezime;
  protected String jmbg;
  protected int godRodj;
  
public Osoba(String imeIPrezime, String jmbg, int godRodj) {
	super();
	this.imeIPrezime = imeIPrezime;
	this.jmbg = jmbg;
	this.godRodj = godRodj;
}
public Osoba() {
	// TODO Auto-generated constructor stub
}
public String getImeIPrezime() {
	return imeIPrezime;
}
public void setImeIPrezime(String imeIPrezime) {
	this.imeIPrezime = imeIPrezime;
}
public String getJmbg() {
	return jmbg;
}
public void setJmbg(String jmbg) {
	this.jmbg = jmbg;
}
public int getGodRodj() {
	return godRodj;
}
public void setGodRodj(int godRodj) {
	this.godRodj = godRodj;
}
  public void print() {
	  System.out.println("Ime i prezime: "+this.imeIPrezime+"Jbmg: "+this.jmbg+"Godina rodjenja: "+this.godRodj);
	  
  }













}
