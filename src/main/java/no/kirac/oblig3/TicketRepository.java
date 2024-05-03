package no.kirac.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;

    public Ticket save(Ticket ticket) {
        // Implementer logikk for å lagre en billett
        return ticket;
    }

    public Ticket findById(Long id) {
        // Implementer logikk for å finne en billett
        return null;
    }

    public List<Ticket> findAll() {
        // Implementer logikk for å finne alle billetter
        return null;
    }

    public Ticket update(Long id, Ticket ticket) {
        // Implementer logikk for å oppdatere en billett
        return ticket;
    }

    public void delete(Long id) {
        // Implementer logikk for å slette en billett
    }
}
