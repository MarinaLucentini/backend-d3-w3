package marinalucentini.entities;

import jakarta.persistence.*;
import marinalucentini.enums.StatoType;

import java.util.UUID;

@Entity
@Table
public class Partecipazioni {
    @Id
    @GeneratedValue
    private UUID id;

    private String persona;
    private String evento;
    @Enumerated(EnumType.STRING)
    private StatoType statoType;


    public Partecipazioni() {

    }

    public Partecipazioni(String persona, String evento, StatoType statoType) {
        this.persona = persona;
        this.evento = evento;
        this.statoType = statoType;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
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
                ", persona='" + persona + '\'' +
                ", evento='" + evento + '\'' +
                ", statoType=" + statoType +
                '}';
    }
}
