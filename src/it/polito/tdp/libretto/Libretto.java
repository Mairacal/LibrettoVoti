package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	List <Voto> listaesami;

	public Libretto() {
		super();
		listaesami=new ArrayList <Voto>();
	}
	 public void add(Voto v) {
		 listaesami.add(v);		 
		 }
	

}
