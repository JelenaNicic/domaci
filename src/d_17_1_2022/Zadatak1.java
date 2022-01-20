package d_17_1_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/////kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

//	
		
		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton>karton=new ArrayList<ZeleniKarton>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite ime studenta: ");
		    String student=s.next();
		    System.out.println("Unesite broj indexa: ");
		    int index=s.nextInt();
		    System.out.println("Naziv predmeta: ");
		    String predmet=s.next();
			System.out.println("Unesite ime profesora: ");
			String profesor=s.next();
			System.out.println("Unesite ocenu: ");
			int ocena=s.nextInt();
			
		ZeleniKarton indeks=new ZeleniKarton(student, index,predmet, profesor, ocena);
		karton.add(indeks);
		}
		for (int i = 0; i < karton.size(); i++) {
			System.out.println(karton.get(i).getImeIprezimeStudenta()+" , "+ karton.get(i).getOcena());
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
