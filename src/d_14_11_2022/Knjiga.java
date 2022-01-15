package d_14_11_2022;

public class Knjiga {
///Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 


	private  String ISBN;
	private String naziv;
	private int godIzdanja;
	private Autor autor;
	
	public Knjiga(){
		
	}
	
	public Knjiga(String ISBN,String naziv,int godIzdanja,Autor autor) {
		this.ISBN=ISBN;
		this.naziv=naziv;
		this.godIzdanja=godIzdanja;
		this.autor=autor;
	}
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	public String getNaziv() {
		return this.naziv;
	}
	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja=godIzdanja;
	}
	public int getGodIzdanja() {
		return this.godIzdanja;
	}
	public void setaAutor( Autor autor) {
		this.autor=autor;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public void print() {
		System.out.println("ISBN: "+this.ISBN);
		System.out.println("Naziv: "+this.naziv+" Godina izdanja: "+this.godIzdanja);
		autor.print();
	}


}