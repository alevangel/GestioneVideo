package is.gestionevideo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import is.gestionevideo.control.GestioneVideo;
import is.gestionevideo.entity.Giornalista;
import is.gestionevideo.entity.Sport;
import is.gestionevideo.entity.Video;
import is.gestionevideo.entity.VideoApprofondimento;
import is.gestionevideo.entity.VideoEvento;

public class Main {

	public static void main(String[] args) {

		GestioneVideo gestionevideo = new GestioneVideo();


		String nome_evento = "Partita Fiorentina-Napoli";

		LocalDate data_evento = LocalDate.of(2019, Month.AUGUST, 24);

		VideoEvento v1 = new VideoEvento(nome_evento, data_evento, Sport.CALCIO);



		nome_evento = "Partita Juventus-Napoli";

		data_evento = LocalDate.of(2019, Month.AUGUST, 31);

		VideoEvento v2 = new VideoEvento(nome_evento, data_evento, Sport.CALCIO);



		nome_evento = "Partita Napoli-Sampdoria";

		data_evento = LocalDate.of(2019, Month.SEPTEMBER, 14);

		VideoEvento v3 = new VideoEvento(nome_evento, data_evento, Sport.CALCIO);



		nome_evento = "Commento Napoli-Sampdoria";

		data_evento = LocalDate.of(2019, Month.SEPTEMBER, 14);

		VideoApprofondimento v4 = new VideoApprofondimento(nome_evento, data_evento, Sport.CALCIO);

		
		nome_evento = "Commento SC Napoli-Juve";

		data_evento = LocalDate.of(2019, Month.SEPTEMBER, 14);

		VideoApprofondimento v6 = new VideoApprofondimento(nome_evento, data_evento, Sport.CALCIO);

		
		v4.addGiornalista(new Giornalista("TIZIO", "CAIO"));
		v4.addGiornalista(new Giornalista("PIPPO", "PLUTO"));




		gestionevideo.caricaVideo(v1);
		gestionevideo.caricaVideo(v2);
		gestionevideo.caricaVideo(v3);
		gestionevideo.caricaVideo(v4);
		gestionevideo.caricaVideo(v6);


		ArrayList<Video> v_ricerca = gestionevideo.ricercaVideo(Sport.CALCIO, "Samp");


		System.out.println("Risultati della ricerca:\n");

		for(Video v : v_ricerca) {

			System.out.println(v+"\n");
		}



		gestionevideo.rimuoviVideo(v1);
		gestionevideo.rimuoviVideo(v2);
		gestionevideo.rimuoviVideo(v3);
		gestionevideo.rimuoviVideo(v4);
		gestionevideo.rimuoviVideo(v6);



		
	}

}
