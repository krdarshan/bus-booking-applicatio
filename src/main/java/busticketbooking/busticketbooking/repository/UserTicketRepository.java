package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.UserTicket;

public interface UserTicketRepository
extends CrudRepository<UserTicket, Integer> {
  Iterable<UserTicket> findAllByPnr(String pnr);
}
