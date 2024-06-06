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
        //locationD.save(location);
        Location locationfound = locationD.findById("540aa42a-d54e-49f5-ac11-8ebfbc70869a");
        Persona persona1 = new Persona("Aldo", "Baglio", "aldobaglio@gmail.com", LocalDate.of(1982, 9, 15), SessoType.MASCHIO);
        personaDao personaDao1 = new personaDao(em);
        //  personaDao1.save(persona1);


        System.out.println("Funziona!");

    }
}
