package no.kirac.oblig3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String film;
    private String seter;
    private String fornavn;
    private String etternavn;
    private String mail;
    private String tlf;

    public Ticket orElse(Object o) {
        return null;
    }

    // Konstruktører og getters/setters som før
}
