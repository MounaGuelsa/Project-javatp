package collections;

import java.util.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Map.Entry;

public class testform {
	public static void main(String[] args) {
		
		//formation
			 formation f1 = new formation("stri");
			 f1.addMatiere("math",5 );
			 f1.addMatiere("java",3 );
			 
			 f1.addMatiere("physic",4);
			 f1.addMatiere("cpp",4);
			 
			 System.out.println("***********************les infos du formation f1*******************************");
			 System.out.println("                                                                            ");
			 System.out.println(f1);
			 System.out.println("******les infos du f1 apres la suppression de la matiere telecom");
			 System.out.println(" ");
			 f1.deleteMat("telecom" );
			 //tableau des identite
			 Identite iden[]= {
					 new Identite("f144","mouna","guelsa"),
					 new Identite("f154","khawla","guelsa"),
					 new Identite("f184","ali","guelsa")};
			
			 //liste des notes ;
			 ArrayList notes1 = new ArrayList();
			 notes1.add(16F);
			 notes1.add(17F);
			 notes1.add(18F);
			 
			 ArrayList notes3 = new ArrayList();
			 notes3.add(16F);
			 notes3.add(11F);
			 notes3.add(14F);
			 
			 //listes des resultats par matiere
			 ArrayList <resultats > res1= new ArrayList();
			 res1.add(new resultats("math",notes1));
			 res1.add(new resultats("physique",notes1));
		
			 
			 
			 HashMap<String, resultats> resultat1 =new HashMap <String, resultats>();
			 resultat1.put("math", new resultats("math",notes3));
			 resultat1.put("physic", new resultats("physic",notes1));
			 resultat1.put("java", new resultats("java",notes1));
			 resultat1.put("cpp", new resultats("cpp",notes1));
	
			 
			 HashMap<String, resultats> resultat2 =new HashMap <String, resultats>();
			 resultat2.put("math", new resultats("math",notes1));
			 resultat2.put("physic", new resultats("physic",notes3));
			 resultat2.put("java", new resultats("java",notes1));
			 resultat2.put("cpp", new resultats("cpp",notes1));
			 
			 Etudiant e1 = new Etudiant(f1,iden[0],resultat1);
			 Etudiant e2 = new Etudiant(f1,iden[1],resultat2);
			 Etudiant e3 = new Etudiant(f1,iden[2],resultat2);
			 
			System.out.println("les informatins de l'etudiant 1");
			System.out.println(e1);
			System.out.println("la moyenne de l'etudiant 1 est ");
			System.out.println(e1.moyenneGenerale());
			System.out.println("la moyenne de l'etudiant 1 dans la matiere math ");
			System.out.println(	e1.resultat.get("math").moyenne("math"));
			System.out.println("*****************************************************************************************************************************************");
			System.out.println("les informatins de l'etudiant 2");
			System.out.println(e2);
			System.out.println("la moyenne de l'etudiant 2 est ");
			System.out.println(e2.moyenneGenerale());
			 
			System.out.println("la moyenne de l'etudiant 2 dans la matiere math ");
			System.out.println(	e2.resultat.get("math").moyenne("math"));
			
			List<Etudiant> e  =  new ArrayList<Etudiant>();
		    e.add(e1);
	     	e.add(e2);
            Groupe g1 =new Groupe (f1,e);
			//List <Groupe>  g1 = new ArrayList <Groupe>();
			//g1.add(new Groupe(f1, e));//
			
		
			
			
			
			
	}}


















			
			
		
			

		


