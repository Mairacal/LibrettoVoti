package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		 // 1Per testare la classe libretto faccio una classe separata
		 // dotata di main per far si che nemmeno per sbaglio io possa
		//utilizzare i dati main senza gli appositi metodi.
	
		// 2Metodo LocalDate permette di creare una data
		
		Libretto libr =new Libretto() ;
	    libr.add(new Voto(28,"Analisi I",LocalDate.of(2017, 1, 15)));
	    libr.add(new Voto(21,"Analisi II",LocalDate.of(2018, 1, 25)));
	    libr.add(new Voto(25,"Fisica I",LocalDate.of(2017, 6, 10)));
	    libr.add(new Voto(28,"Fisica II",LocalDate.of(2018, 9, 3)));
	    libr.add(new Voto(18,"Logistica",LocalDate.of(2017, 9, 1)));
	    libr.add(new Voto(20,"Geometria",LocalDate.of(2018, 1, 28)));
	    libr.add(new Voto(25,"Basi di dati",LocalDate.of(2018, 6, 5)));
	    libr.add(new Voto(24,"Economia",LocalDate.of(2019, 2, 15)));
	    libr.add(new Voto(25,"Ricerca Operativa",LocalDate.of(2019, 1, 25)));
	    libr.add(new Voto(27,"Programmazione ad oggetti",LocalDate.of(2017, 1, 3)));
        
	

         Voto giusto=new Voto(20,"Geometria",LocalDate.now());
         Voto sbagliato=new Voto(28,"Geometria",LocalDate.now());
         Voto inesistente=new Voto( 30,"Informatica",LocalDate.now());
     System.out.println(libr.esisteGiaVoto(giusto));
     System.out.println(libr.esisteGiaVoto(sbagliato));
     System.out.println(libr.esisteGiaVoto(inesistente));
         
}

}
