package busticketbooking.busticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

  @Id
  String pnr;

  String bus_id;
  String method;
  int amount;
  String email;
  String passenger_mobile_number;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public String getBusId() {
    return bus_id;
  }

  public void setBusId(String bus_id) {
    this.bus_id = bus_id;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassengerMobileNumber() {
    return passenger_mobile_number;
  }

  public void setPassengerMobileNumber(String passenger_mobile_number) {
    this.passenger_mobile_number = passenger_mobile_number;
  }
}
