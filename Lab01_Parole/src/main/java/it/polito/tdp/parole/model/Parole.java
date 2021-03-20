package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	LinkedList<String> elencoParole;
		
	public Parole() {
	
		elencoParole = new LinkedList<String>();	
	}
	
	public void addParola(String p) {
		
		elencoParole.add(p);
	}
	
	public List<String> getElenco() {	
		
		return elencoParole;
	}
	
	public void reset() {
	
		elencoParole.clear();	
	}
	
	public void removeParola(String p) {
		
		elencoParole.remove(p);
	}

}
