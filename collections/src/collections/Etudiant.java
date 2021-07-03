package collections;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class Etudiant {
	
	private formation f;
	private Identite i;

    HashMap<String, resultats> resultat =new HashMap <String, resultats>();
	
	
  
   @Override
	public String toString() {
		return "Etudiant [f= " + f + ", i=" + i + ", resultat=" + resultat + "]";
	}


public Etudiant(formation f, Identite i, HashMap<String, resultats> resultat) {
		super();
		this.f = f;
		this.i = i;
		this.resultat = resultat;
	}
   
	
    public formation getF() {
	return f;
}


public Identite getI() {
	return i;
}


	public HashMap<String, resultats> getResultat() {
	return resultat;
}


public void setResultat(HashMap<String, resultats> resultat) {
	this.resultat = resultat;
}


	float moyenneGenerale(){
    	int i=0;
    	float sum=0;
    	for (String matiere: resultat.keySet())
    	{
    		float mg = resultat.get(matiere).moyenne(matiere)*f.mats.get(matiere);
    		sum+=mg;
    		i+=f.mats.get(matiere);
    	}
    	
    	return sum/i;
    }
	
  //modifier formation
    
    public void setF(formation f) {
		this.f = f;
	}
	

    
	
    
	
}
