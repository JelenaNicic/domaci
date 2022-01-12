package d11_1_2022;



public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Proizvod a=new Proizvod();
		
		a.naziv="Naocare";
		a.tezina=150;
		a.cena=10000;
		
		a.povecajCenu(30);
		
		a.stampaj();
		
		
		double popust=a.vratiCenuSaPopustom(40);
		System.out.println(popust);
		
	    int x=a.racunajPostarinu();
		System.out.println("Postarina: "+x);
		
		
		
		
		
		
//		 double d=.cenaSaPopustom(30);
//		 System.out.println("Cena sa popustom" +d);
		
		Proizvod b=new Proizvod();
		
		b.naziv="Kafa";
		b.tezina=150;
		b.cena=200;
		
	b.stampaj();
		
		int z=b.racunajPostarinu();
		System.out.println("Postarina: " +z);
		
		
		
		}
		
	}
   


	


