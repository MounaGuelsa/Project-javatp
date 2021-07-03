package collections;

import java.util.*;
public class Identite {
	
	private String nip;
	private String nom;
	private String prenom;
	public Identite(String nip, String nom, String prenom) {
		super();
		this.nip = nip;
		this.nom = nom;
		this.prenom = prenom;
	}
	 
	
	public String toString() {
		return "Identite [nip=" + nip + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public String getNip() {
		return nip;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	
}}
