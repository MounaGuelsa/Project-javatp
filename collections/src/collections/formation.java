package collections;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class formation {

	public String  id;

	public formation(String id) {
		super();
		this.id = id;
		
		mats = new HashMap();
	}

	
	@Override
	public String toString() {
		return "formation [id=" + id + ", mats=" + mats + "]";
	}


	HashMap<String, Integer> mats =new HashMap<String, Integer>();
	
	void addMatiere(String nomMat, int cf )
	
	{mats.put(nomMat,cf);
		
	}
	void deleteMat(String nomMat) {
		mats.remove(nomMat);
	}
	Integer getCfByMat(String nomMat) {
		Integer a;
		a=mats.get(nomMat);
		
		return a;
	
	}
	
	
	

}
