package d_24_1;

public class SuperKartica {
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)

private String brojKartice;
private String imeIPrezimeVlasnika;
private int popust;

public SuperKartica() {
	super();
	// TODO Auto-generated constructor stub
}
public SuperKartica(String brojKartice, String imeIPrezimeVlasnika, int popust) {
	super();
	this.brojKartice = brojKartice;
	this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	this.popust = popust;
}
public String getBrojKartice() {
	return brojKartice;
}
public void setBrojKartice(String brojKartice) {
	this.brojKartice = brojKartice;
}
public String getImeIPrezimeVlasnika() {
	return imeIPrezimeVlasnika;
}
public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
	this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
}
public int getPopust() {
	return popust;
}
public void setPopust(int popust) {
	this.popust = popust;
}

public void print() {
	System.out.println("Broj kartice:"+this.brojKartice);
	System.out.println("ime i prezime: "+this.imeIPrezimeVlasnika);
}








}
