package training.springcloud.stream.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import training.springcloud.stream.model.Animal;
import training.springcloud.stream.model.Person;
import training.springcloud.stream.publisher.MessagePublisher;

@RestController("api/publish")
public class ApiController {

	@Autowired
	private MessagePublisher publisher;

	@GetMapping("person")
	public String publishPerson() {
		Person person = new Person(UUID.randomUUID(), "Zack");
		publisher.publishPersonObject().send(MessageBuilder.withPayload(person).build());
		return "Person published";
	}

	@GetMapping("animal")
	public String publishAnimal() {
		Animal animal = new Animal(UUID.randomUUID(), "Lion");
		publisher.publishAnimalObject().send(MessageBuilder.withPayload(animal).build());
		return "Person published";
	}

}
