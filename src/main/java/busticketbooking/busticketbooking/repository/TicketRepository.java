package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.Ticket;


public interface TicketRepository extends CrudRepository<Ticket, String> {
  public Ticket findByPnr(String pnr);

  public Iterable<Ticket> findAllByEmail(String email);
}