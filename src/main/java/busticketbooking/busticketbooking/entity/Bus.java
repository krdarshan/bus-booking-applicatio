package busticketbooking.busticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {

  @Id
  private String bus_number;

  private String bus_name;
  private String source;
  private String destination;
  private String date;
  private String time;

  public String getBusNumber() {
    return bus_number;
  }

  public void setBusNumber(String busNumber) {
    this.bus_number = busNumber;
  }

  public String getBusName() {
    return bus_name;
  }

  public void setBusName(String busName) {
    this.bus_name = busName;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  // TODO : these String can be parsed into Date using SimpleDateFormat

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
