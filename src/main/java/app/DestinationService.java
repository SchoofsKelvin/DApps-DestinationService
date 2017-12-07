package app;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import travel.model.Destination;

@Component
public class DestinationService {

	private HashMap<String, Destination> destinations = new HashMap<>();

	public DestinationService() {
		addDestination(new Destination("Leuven"));
		addDestination(new Destination("Tienen"));
	}

	public void addDestination(Destination destination) {
		destinations.put(destination.getName().toLowerCase(), destination);
	}

	public Collection<Destination> getAll() {
		return destinations.values();
	}

	public Destination get(String name) {
		return destinations.get(name.toLowerCase());
	}
}
