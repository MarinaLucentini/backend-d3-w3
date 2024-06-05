package marinalucentini.entities;

import jakarta.persistence.*;
import marinalucentini.enums.StatoType;

import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Partecipazioni {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToMany
    @JoinTable(name = "persona_partecipazioni", joinColumns = @JoinColumn(name = "partecipazioni_id"), inverseJoinColumns = @JoinColumn(name = "persona_id"))
    private List<Persona> personaList;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private StatoType statoType;


    public Partecipazioni() {

    }

    public Partecipazioni(List<Persona> persona, Evento evento, StatoType statoType) {
        this.personaList = persona;
        this.evento = evento;
        this.statoType = statoType;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public UUID getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public StatoType getStatoType() {
        return statoType;
    }

    public void setStatoType(StatoType statoType) {
        this.statoType = statoType;
    }

    @Override
    public String toString() {
        return "Partecipazioni{" +
                "id=" + id +

                ", evento='" + evento + '\'' +
                ", statoType=" + statoType +
                '}';
    }
}
