package d_24_1;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Korpa korpa=new Korpa();
           StaklenaAmbalaza staklena=new StaklenaAmbalaza("354678", "Pivo", 0.5, 0.7, 100, true, 100);
           Tetrapak tetra=new Tetrapak("3456", "mleko", 1.0, 1.1, false, 130);
           SuperKartica kartica=new SuperKartica("9374", "Jelena", 20);
           korpa.dodajAmbalazu(tetra);
           korpa.dodajAmbalazu(staklena);
         
           korpa.izbaciAmbalazu("3456");
         
           System.out.println("Ukupna cena: "+korpa.ukupnaCena(kartica));
	}
          
}
