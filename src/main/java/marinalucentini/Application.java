package marinalucentini;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marinalucentini.dao.eventoDao;
import marinalucentini.dao.locationDao;
import marinalucentini.dao.personaDao;
import marinalucentini.entities.Location;
import marinalucentini.entities.Persona;
import marinalucentini.enums.SessoType;

import java.time.LocalDate;


public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        eventoDao event = new eventoDao(em);
        Location location = new Location("L'isola che non c'è", "Roma");
        locationDao locationD = new locationDao(em);
        //   locationD.save(location);
        Location locationfound = locationD.findById("c8f0a309-57d6-40f6-a8b3-5afe089709a1");
        Persona persona1 = new Persona("Aldo", "Baglio", "aldobaglio@gmail.com", LocalDate.of(1982, 9, 15), SessoType.MASCHIO);
        personaDao personaDao1 = new personaDao(em);
        personaDao1.save(persona1);

        //    Evento evento = new Evento("Basta Java", LocalDate.of(2024,9,15), "Bellissima ruota", tipoEvento.PUBBLICO, 50);
        System.out.println("Funziona!");

    }
}
