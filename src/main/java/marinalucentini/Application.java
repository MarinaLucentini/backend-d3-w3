package marinalucentini;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marinalucentini.dao.eventoDao;
import marinalucentini.dao.locationDao;
import marinalucentini.dao.partecipazioniDao;
import marinalucentini.dao.personaDao;
import marinalucentini.entities.Evento;
import marinalucentini.entities.Location;
import marinalucentini.entities.Partecipazioni;
import marinalucentini.entities.Persona;
import marinalucentini.enums.SessoType;
import marinalucentini.enums.StatoType;
import marinalucentini.enums.tipoEvento;

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

        Evento evento = new Evento("L'isola che non c'è", LocalDate.of(2024, 07, 05), "evento per bambini", tipoEvento.PUBBLICO, 50, locationfound);
        eventoDao evento1 = new eventoDao(em);
        // evento1.save(evento);
        Evento eventofound = evento1.findById("1c288bf3-0a18-49ab-82b2-0d58d7423c4d");
        Persona personafound = personaDao1.findById("c5af54ee-1e21-4954-8f15-d56b86340f2b");
        Partecipazioni partecipazione = new Partecipazioni(personafound, eventofound, StatoType.DA_CONFERMARE);
        partecipazioniDao partecipazione1 = new partecipazioniDao(em);
        // partecipazione1.save(partecipazione);
        System.out.println("Funziona!");

    }
}
