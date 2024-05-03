package no.kirac.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketRepository repository;

    @PostMapping("/save")
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return repository.save(ticket);
    }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        Ticket ticket = repository.findById(id);
        return ticket.orElse(null); // Håndterer 'Optional'
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticketDetails) {
        return repository.update(id, ticketDetails); // Antatt at update() eksisterer
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        repository.delete(id);
    }
}
