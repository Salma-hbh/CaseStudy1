package Classe;

import java.util.*;

public class Fichier implements Element {
	Scanner cl = new Scanner(System.in);
	String nom ;
	double taille;
	Fichier(String nom,double taille){
		this.nom=nom;
		this.taille= taille;
	}
	@Override
	public String getName() {
		
		return this.nom;
	}
	@Override
	public double getLenght() {
		
		return this.taille;
	}
	@Override
	public void New(String nom, double taill) {
		System.out.println("Enter your UserName");
		String s1= cl.next();
		System.out.println("Enter your password");
		String s2= cl.next();
		if(s1.equals(User.auth1()) && s2.equals(User.auth2())  ) {
			Fichier f = new Fichier(nom , taill);
			Dossier.ensF.add(f);
		}
		else {
			System.out.println("Error");
		}
		
		
		
	}
	public void Supp(Fichier f) {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(User.auth1())&& s2.equals(User.auth2()) && Dossier.ensF.contains(f)) {
			Dossier.ensF.remove(f);
		}
		else {
			System.out.println("Error");
		}
		
	}

}
