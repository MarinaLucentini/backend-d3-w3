package marinalucentini.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import marinalucentini.entities.Location;
import marinalucentini.exception.eventoException;

import java.util.UUID;

public class locationDao {
    private final EntityManager em;

    public locationDao(EntityManager em) {
        this.em = em;
    }

    public void save(Location location) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(location);
        transaction.commit();
        System.out.println("La location" + location.getNome() + "è stato aggiunto con successo");
    }

    public Location findById(UUID id) {
        Location location = em.find(Location.class, id);
        if (location == null) throw new eventoException(id);
        return location;
    }

    public void findAndRemovedById(UUID id) {
        Location found = this.findById(id);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("L'evento " + found.getNome() + "è stato eliminato");
    }
}
