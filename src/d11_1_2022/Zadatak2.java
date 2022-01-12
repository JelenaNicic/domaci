package d11_1_2022;



public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SmartAirConditioning w= new SmartAirConditioning();
		
		w.markaKlime="Samsung";
		w.temp=20;
		w.mod="greje";
		w.elGreje=2;
		w.elHladi=1;
		
		
		
		int potrosnja=w.mesecnaPotrosnja();
		System.out.println("Mesecna potrosnja je :" +potrosnja);
		w.print();
		
		
		
		SmartAirConditioning q=new SmartAirConditioning();
		
		q.markaKlime="Gree";
		q.temp=21;
		q.mod="hladi";
		
		
		q.print();
	}

}
