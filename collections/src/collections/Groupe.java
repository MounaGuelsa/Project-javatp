package collections;

import java.util.*;

public class Groupe {
	
	@Override
	public String toString() {
		return "Groupe [f=" + f + ", e=" + e + "]";
	}

	private formation f;
	private 	List<Etudiant> e  =  new ArrayList<Etudiant>();
	
	public Groupe(formation f, List<Etudiant> e1) {
		super();
		this.f = f;
		this.e = e;
	}
	
	
	public void addetudiant(Etudiant e1)

	{
		e.add(e1);
	}
	public void deletetudiant(Etudiant e1)

	{
		e.remove(e1);
	}
	float moyenneParMatiere(String nomMat)
	{
	float sum=0;
	int a=e.size();
	int i=0;
	for( i= 0; i < a; i++)
	{
		HashMap<String, resultats> r =e.get(i).getResultat();
		
		
		 Iterator iterator = r.entrySet().iterator();
	        while (iterator.hasNext()) {
	          Map.Entry mapentry = (Map.Entry) iterator.next();
	 
	          float mg= r.get(nomMat).moyenne(nomMat);
	     
	        sum=sum+mg;
	        i++;
	        }
	       
	}

	return sum/a ;
}
	
	    float moyenneGeneraleDuGrp() {
	    	float sum=0;
	    	int a= e.size();
	    	for(int i = 0; i <e.size(); i++)
	    	{ float m=e.get(i).moyenneGenerale();
                  sum=sum+m;}
	    	
	    	return sum/a;
	    }
	    public List<Etudiant> TriMerite(){
	    	Collections.sort(this.e,new Comparator<Etudiant>() {

	    		@Override
	    		public int compare(Etudiant e1, Etudiant e2) {
	    			// TODO Auto-generated method stub
	    			
	    			if(e1.moyenneGenerale()>e2.moyenneGenerale())
	    				return 1;
	    			 else 
	    				 if(e1.moyenneGenerale()<e2.moyenneGenerale())
	    			return -1;
	    			   return 0;
	    		}
	    		
	    	});
	    	return this.e;
	    }
	    public ArrayList<Etudiant> TriAlphabitique()
	    {
	    	Collections.sort(this.e,new Comparator<Etudiant>() {

	    		@Override
	    		public int compare(Etudiant e1, Etudiant e2) {
	    			// TODO Auto-generated method stub
	    			
	    			if(e1.getI().getNom().equals(e2.getI().getNom()))
	    				return 1;
	    			 else 
	    				 if(e2.getI().getNom().equals(e1.getI().getNom()))
	    			return -1;
	    			   return 0;
	    		}
	    		
	    	});
	    	
	    	return (ArrayList<Etudiant>) this.e;
}


		public Iterator<Etudiant> iterator() {
			// TODO Auto-generated method stub
			return null;
		}


		public formation getF() {
			return f;
		}


		public List<Etudiant> getE() {
			return e;
		}


		
}  
	
