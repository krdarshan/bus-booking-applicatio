package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
  public User findByAadhar(String aadhar);

  public User findByEmail(String email);
}
