package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.VerifyUser;

public interface VerifyUserRepository
  extends CrudRepository<VerifyUser, String> {
  public VerifyUser findByEmail(String email);

  public void deleteByEmail(String email);
}
