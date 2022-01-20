package d_17_1_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		      Racun biznis=new Racun();
	          biznis.setBrojRacuna("100-646-383");
	          biznis.setImeIPrezime("Jelena Nicic");
	          biznis.menjaStanje(80000);
	          biznis.getTrenutnoStanje();
	          biznis.menjaStanje(4999);
	          biznis.print();
	
	          
	          
			

	          
			   Racun pro=new Racun();

	          pro.setBrojRacuna("130-293-393");
	          pro.setImeIPrezime("Stevan Nicic");
	         
	          pro.getTrenutnoStanje();
	          pro.menjaStanje(4000);
	          pro.print();
	          Transakcija w=new Transakcija();
	          w.setNaKojiSePrenose(biznis);
	          w.setSaKogSePrenose(pro);
	          w.setIdTransakcije(678);
	          w.stampaj();
	      
		     
      
	}

}
