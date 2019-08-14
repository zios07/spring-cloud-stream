package training.springcloud.stream.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import training.springcloud.stream.model.Animal;
import training.springcloud.stream.publisher.MessagePublisher;

@RestController("api/publish/animal")
public class AnimalController {

	@Autowired
	private MessagePublisher publisher;

	@GetMapping
	public String publishAnimal() {
		Animal animal = new Animal(UUID.randomUUID(), "Lion");
		publisher.publishAnimalObject().send(MessageBuilder.withPayload(animal).build());
		return "Animal published";
	}

}
