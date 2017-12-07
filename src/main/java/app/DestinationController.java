package app;


import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import travel.model.Destination;

@CrossOrigin
@RestController
public class DestinationController {

	private DestinationService service;

	@Autowired
	public DestinationController(DestinationService service) {
		this.service = service;
	}

    @RequestMapping("/add")
    public void add(@RequestBody Destination destination) {
        service.addDestination(destination);
    }
    
    @RequestMapping("/get")
    public Destination get(@RequestParam(value="name", defaultValue="Leuven") String name) {
    	return service.get(name);
    }
    
    @RequestMapping("/getall")
    public Collection<Destination> getAll() {
    	return service.getAll();
    }
    
}