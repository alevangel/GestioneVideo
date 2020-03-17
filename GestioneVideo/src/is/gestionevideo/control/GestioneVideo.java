package is.gestionevideo.control;

import java.util.ArrayList;

import is.gestionevideo.entity.Sport;
import is.gestionevideo.entity.Video;

public class GestioneVideo {

	ArrayList<Video> lista_video;
	
	
	public GestioneVideo() {
		
		lista_video = new ArrayList<Video>();
	}
	
	
	
	public ArrayList<Video> ricercaVideo(Sport s, String testo) {
		
		ArrayList<Video> lista_risultati = new ArrayList<Video>();
		
		
		for(Video v : lista_video) {
			
			if( (s == null || v.getSport().equals(s)) && 
				(testo == null || v.getNome().contains(testo)) ) {
				
				/* Nota: se uno dei parametri di input è null, 
				 * viene ignorato dalla ricerca
				 */
				
				lista_risultati.add(v);
			}
		}
		
		
		return lista_risultati;
	}
	
	
	
	public void caricaVideo(Video v) {
		
		lista_video.add(v);
	}
	
	
	public void rimuoviVideo(Video v) {
		
		lista_video.remove(v);
	}	
	
	public void visualizzaVideo(Video v) {
		
	}
	
	public void attivaNotifiche() {
		
	}
	
	public int consultaVisualizzazioni(Video v) {
		return 0;
	}
}
