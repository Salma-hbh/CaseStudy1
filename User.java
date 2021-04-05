package Classe;

import java.util.*;
public class User extends Personne {
	static Scanner cl = new Scanner(System.in);

	User(String nom, String prenom) {
		super(nom, prenom);
		
	}
	static public String auth1() {
		System.out.println("ENTER YOUR USERNAME");
		String UserName= cl.next();
		return UserName ;
		
	}
	static public String auth2() {
		System.out.println("ENTER YOUR Password");
		String Password= cl.next();
		return Password ;
	}
		

}
