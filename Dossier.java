package Classe;

import java.util.*;


public class Dossier implements Element {
	Scanner cl = new Scanner(System.in);
	String nom ;
	double taill ;
	static TreeSet<Fichier> ensF = new TreeSet<>();
	Dossier(String nom , double taill){
		this.nom=nom;
		this.taill= taill;
	}

	@Override
	public String getName() {
		return this.nom;
	}

	@Override
	public double getLenght() {
		return this.taill;
	}

	@Override
	public void New(String nom, double taill) {
		System.out.println("Enter your UserName");
		String s1= cl.next();
		System.out.println("Enter your password");
		String s2= cl.next();
		if(s1.equals(User.auth1()) && s2.equals(User.auth2())  ) {
			Dossier d = new Dossier(nom , taill);
			Repertoire.ensD.add(d);
		}
		else {
			System.out.println("Error");
		}
		
		
	}
	public void Supp(Dossier d) {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(User.auth1())&& s2.equals(User.auth2()) && Repertoire.ensD.contains(d)) {
			Repertoire.ensD.remove(d);
		}
		else {
			System.out.println("Error");
		}
		
	}
	public void afficher() {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(User.auth1())&& s2.equals(User.auth2())) {
			System.out.println("les fichiers de ce dossier sont: ");
			for(Fichier f : ensF) {
				System.out.println(f.nom);
			}
		}
		else {
			System.out.println("Error");
		}
	}

}
