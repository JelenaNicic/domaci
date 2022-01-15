package d_14_11_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor srpski = new Autor();
		srpski.setIme("Borisav");
		srpski.setPrezime("Stankovic");

		Knjiga top = new Knjiga("YUT", "Necista krv", 1910, srpski);
		top.print();

		Knjiga prva = new Knjiga();
		prva.setaAutor(srpski);
		prva.setGodIzdanja(1924);
		prva.setISBN("AJN");
		prva.setNaziv("Kostana");
		prva.print();

		Autor engleski = new Autor("Rhonda", "Byrne");

		Knjiga triler = new Knjiga("124", "The Secret", 2006, engleski);
		triler.print();

		Autor americki = new Autor();
		americki.setIme("Frank");
		americki.setPrezime("Herbert");

		Knjiga naucna = new Knjiga();
		naucna.setaAutor(americki);
		naucna.setGodIzdanja(1965);
		naucna.setISBN("374");
		naucna.setNaziv("Dune");
		naucna.print();

	}

}
