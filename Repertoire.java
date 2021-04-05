package Classe;
import java.util.*;

public class Repertoire {
	String nom;
	double taill ;
	Scanner cl = new Scanner(System.in);
	static TreeSet<Dossier> ensD= new TreeSet<>();
	Repertoire(String nom, double taill){
		this.nom=nom;
		this.taill= taill;
	}
	public void afficher() {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(User.auth1())&& s2.equals(User.auth2())) {
			System.out.println("les dossiers de ce repertoire sont :");
			for(Dossier d : ensD) {
				System.out.println(d.nom);
			}
		}
		else {
			System.out.println("Error");
		}
		
	}

}
