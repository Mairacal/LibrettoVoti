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
	public List<Voto> cercaVoti(int voto){
		
		return null;
		
	}
	public Voto cercaEsame(String nomeEsame) {
		//Per cercare un esame all'interno di una lista al posto
		// di usare il ciclo for si possono sfruttare i metodi delle
		// liste
		//Mi serve solo come criterio di ricerca
	
		Voto v=new Voto(0,"nomeEsame",null);
		int pos= listaesami.indexOf(v);
		
		if(pos==-1)
			return  null;
		else
       	return listaesami.get(pos);
		
	}
	   // metodo creato per verificare se quando provo ad aggiungere
       // un esame quell'esame é stato giá aggiunto
	
	public boolean esisteGiaVoto(Voto v) {
		// dato che qui ho in mano direttamente l'oggetto non mi conviene
		// richiamare il metodo cercaEsame ma mi conviene utilizzare direttamente
		//la index of
		
	 //	Voto trovato=this.cercaEsame(v.getCorso());
	//	if(trovato ==null)
		//	return false;
	//	if(trovato.getPunti()==v.getPunti()) {
		//	return true;}
	//	else return false;
		
	int pos=this.listaesami.indexOf(v);
	if( pos==-1)
		return false;
	else return (v.getPunti()==listaesami.get(pos).getPunti());
	
	}
	
	

}
