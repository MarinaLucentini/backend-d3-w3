package marinalucentini;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marinalucentini.entities.CreazioneEvento;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        CreazioneEvento.avvioApplicazione(emf);
        System.out.println("Hello World!");

    }
}
