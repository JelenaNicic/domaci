package d_20_1_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<Igrac>igraci=new ArrayList<Igrac>();
		for (int i = 0; i <2; i++) {
			System.out.println("Unesite ime: ");
			String ime=s.next();
			System.out.println("Unesite jmbg: ");
			int jmbg=s.nextInt();
			System.out.println("Unesite godinu rodjenja: ");
			int godRodj=s.nextInt();
			System.out.println("Unesite broj: ");
			int broj=s.nextInt();
			System.out.println("Unesite poziciju: ");
			String pozicija=s.next();
			System.out.println("unesite da li je kapiten igrac: ");
			boolean kapiten=s.nextBoolean();
			Igrac plavi=new Igrac(ime,jmbg,godRodj,broj,pozicija,kapiten);
			igraci.add(plavi);
			
		}
		for (int i = 0; i <igraci.size(); i++) {
         igraci.get(i).print();
   
		}
		
		ArrayList<Trener>treneri=new ArrayList<Trener>();
		for (int i = 0; i <2; i++) {
			System.out.println("Unesite ime: ");
			String ime=s.next();
			System.out.println("Unesite jmbg: ");
			int jmbg=s.nextInt();
			System.out.println("Unesite godinu rodjenja: ");
			int godRodj=s.nextInt();
			System.out.println("Unesite godine iskustva: ");
			int godIskustva=s.nextInt();
			System.out.println("Unesite tip: ");
			String tip=s.next();
			Trener trener1=new Trener(ime, jmbg, godRodj, godIskustva, tip);
			treneri.add(trener1);
		}
		for (int i = 0; i < args.length; i++) {
			treneri.get(i).print();
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}	
}