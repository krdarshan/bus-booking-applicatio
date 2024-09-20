package busticketbooking.busticketbooking.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import busticketbooking.busticketbooking.Response;
import busticketbooking.busticketbooking.entity.Bus;
import busticketbooking.busticketbooking.repository.BusRepository;

@RestController
@RequestMapping("/api")
public class BusController {

  @Autowired
  private BusRepository busRepository;

  // QUERY
  // http://localhost:8080/api/create-Bus?busName=dusky_bus&busNumber=212&source=patna&destination=bangalore&date=17-07-2024&time=23:41
  @GetMapping("/create-bus")
  public Response createBus(@ModelAttribute Bus bus) {
    busRepository.save(bus);
    Response response = new Response();
    response.message = "Bus Created Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/edit-bus")
  public Response editBus(@ModelAttribute Bus bus) {
    String busId = bus.getBusNumber();

    if (busRepository.existsById(busId)) {
      Bus existingBus = busRepository.findById(busId).get();
      if (bus.getBusName() != null) {
        existingBus.setBusName(bus.getBusName());
      }
      if (bus.getSource() != null) {
        existingBus.setSource(bus.getSource());
      }
      if (bus.getDestination() != null) {
        existingBus.setDestination(bus.getDestination());
      }
      if (bus.getDate() != null) {
        existingBus.setDate(bus.getDate());
      }
      if (bus.getTime() != null) {
        existingBus.setTime(bus.getTime());
      }

      busRepository.save(existingBus);
      Response response = new Response();
      response.message = "Bus Edited Successfully";
      response.status = 200;
      return response;
    } else {
      Response response = new Response();
      response.message = "bus Not Found";
      response.status = 404;
      return response;
    }
  }

  // QUERY
  // http://localhost:8080/api/delete-Bus?busId=212
  @GetMapping("/delete-bus")
  public Response deleteBus(@RequestParam String busId) {
    busRepository.deleteById(busId);
    Response response = new Response();
    response.message = "Bus Deleted Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/all-buss")
  public Iterable<Bus> allBuss() {
    return busRepository.findAll();
  }

  @GetMapping("/search-bus-by-id")
  public Bus searchBusById(@RequestParam String busId) {
    return busRepository.findById(busId).get();
  }

  @GetMapping("/search-bus")
  public Iterable<Bus> searchTicket(
    @RequestParam String source,
    @RequestParam String destination,
    @RequestParam String date
  ) {
    // return busRepository.findAll();
    return busRepository.findAllBySourceAndDestinationAndDate(
      source,
      destination,
      date
    );
  }
}
