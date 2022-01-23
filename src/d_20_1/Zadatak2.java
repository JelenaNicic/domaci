package d_20_1;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		Igrac igrac=new Igrac("Mirko Mirkovic", "2342", 1987, 7, "napadac",true);
		
		Karton karton1=new Karton("zuti");
		Karton karton2=new Karton("zuti");
		Karton karton3=new Karton("crveni");
		igrac.dodajKarton(karton1);
		igrac.dodajKarton(karton2);
		igrac.dodajKarton(karton3);
        int crveni= igrac.brojCrvenih();
        int zuti=igrac.brojZutih();
        igrac.print();
		
		System.out.println("Broj crvenih: "+crveni);
		System.out.println("Broj zutih: "+zuti);
		
		
		
		
		
		
		
		
		
		
		
	}

}
