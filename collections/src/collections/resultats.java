package collections;

import java.util.ArrayList;
import java.util.List;

public class resultats {

	
	
	private String nommat;
	List<Float> notes =  new ArrayList<Float>();
	public resultats(String nommat, List<Float> notes) {
		super();
		this.nommat = nommat;
		this.notes = notes;
	}
	  void addNote(float note )
		
	  	{ 
	      	notes.add(note);
	  		
	  	}
	  
	  float moyenne(String nomMat)
	  {int i;
		  float s=0;
	  for(i = 0; i <notes.size(); i++)
	  { s+=notes.get(i);}
		  s=s/i;

		  return s;
	  }
	@Override
	public String toString() {
		return "resultats [nommat=" + nommat + ", notes=" + notes + "]";
	}
}
