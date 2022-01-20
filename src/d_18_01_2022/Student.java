package d_18_01_2022;

import java.util.ArrayList;

public class Student {
//broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private int brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

	public Student() {

	}

	public Student(int brojIndeksa, String imeIPrezime, String tipStudija, ArrayList<Ispit> nizIspita) {
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
		this.nizIspita = nizIspita;
	}

	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public void dodajIspit(Ispit ispit) {
		this.nizIspita.add(ispit);
		{

		}
	}

	public double prosek() {
		double prosek = 0;
		double suma = 0;

		for (int i = 0; i < nizIspita.size(); i++) {
			if (this.nizIspita.get(i).daLiJePolozen() == true)
				suma = suma + this.nizIspita.get(i).getOcena();
		}
		prosek = suma / this.nizIspita.size();
		return prosek;
	}

	public void print() {
		System.out.println("Broj indeksa: " + this.brojIndeksa +" "+" Ime i prezime: " + this.imeIPrezime + " Tip studija: "
				+ this.tipStudija);
		for (int i = 0; i < nizIspita.size(); i++) {
			System.out.println(this.nizIspita.get(i).getNazivPredmeta());
			System.out.println(this.nizIspita.get(i).getImeIPrezimeProfesora());
			System.out.println(this.nizIspita.get(i).getOcena());

		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}   
   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

