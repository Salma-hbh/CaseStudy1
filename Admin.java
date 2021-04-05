package Classe;

import java.util.*;
public class Admin extends Personne {
	TreeSet<User> ensU= new TreeSet<>();

	Admin(String nom, String prenom) {
		super(nom, prenom);
	}
	public void inscrire(User u) {
		if(ensU.contains(u)) {
			System.out.println("Vous etes déja inscrit");
		}
		else
			ensU.add(u);
	}
	

}
