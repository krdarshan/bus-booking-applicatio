package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.Bus;

public interface BusRepository extends CrudRepository<Bus, String> {
  public Iterable<Bus> findAllBySourceAndDestinationAndDate(
    String source,
    String destination,
    String date
  );
}
