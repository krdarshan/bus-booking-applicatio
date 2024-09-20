package busticketbooking.busticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import busticketbooking.busticketbooking.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, String> {
  public Admin findByAadhar(String aadhar);

  public Admin findByEmail(String email);
}
