package is.gestionevideo.entity;

import java.util.ArrayList;

import java.time.LocalDate;

public class VideoApprofondimento extends Video {

	private ArrayList<Giornalista> giornalisti = new ArrayList<Giornalista>();
	
	public VideoApprofondimento(int id, String nome, LocalDate data, Sport sport) {
		super(id, nome, data, sport);
		// TODO Auto-generated constructor stub
	}
	
	public VideoApprofondimento(String nome, LocalDate data, Sport sport) {
		super(nome, data, sport);
		// TODO Auto-generated constructor stub
	}

	public void addGiornalista(Giornalista g) {
		giornalisti.add(g);
	}
	
	public ArrayList<Giornalista> getGiornalisti() {
		return giornalisti;
	}
	
	
	public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("VIDEO APPROFONDIMENTO: "+id+", "+nome+", "+data+", "+sport+"\n");
		
		for(Giornalista g : giornalisti) {
			buf.append("  GIORNALISTA: "+g.getNome()+" "+g.getCognome()+"\n");
		}
		
		return buf.toString();
	}
	
}
