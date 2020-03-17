package is.gestionevideo.entity;

import java.time.LocalDate;

public class VideoEvento extends Video {

	public VideoEvento(int id, String nome, LocalDate data, Sport sport) {
		super(id, nome, data, sport);
	}
	
	public VideoEvento(String nome, LocalDate data, Sport sport) {
		super(nome, data, sport);
	}
	
	public String toString() {
		return "VIDEO EVENTO: "+id+", "+nome+", "+data+", "+sport;
	}

}
