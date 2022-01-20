package d_17_1_2022;

public class ZeleniKarton {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime

	
	
	private String imeIprezimeStudenta;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;
	
	public ZeleniKarton(String imeIprezimeStudenta,int brojIndeksa,String nazivPredmeta,String imeIPrezimeProfesora,int ocena ) {
		this.imeIprezimeStudenta=imeIprezimeStudenta;
		this.brojIndeksa=brojIndeksa;
		this.nazivPredmeta=nazivPredmeta;
		this.imeIPrezimeProfesora=imeIPrezimeProfesora;
		this.ocena=ocena;
	}
	
	public String getImeIprezimeStudenta() {
		return imeIprezimeStudenta;
	}
	public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
		this.imeIprezimeStudenta = imeIprezimeStudenta;
	}
	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public boolean daLiJeIspitPolozen() {
		if (this.ocena>5) {
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.println("Naziv predmeta: "+this.nazivPredmeta+"Ocena: "+this.ocena);
		System.out.println("Ime i prezime studenta: "+this.imeIprezimeStudenta);
		System.out.println("Ime i prezime profesora: "+this.imeIPrezimeProfesora);
	}
	
	
	
	
	
	
	
	
}
