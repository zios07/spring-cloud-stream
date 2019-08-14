package training.springcloud.stream.rest;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import training.springcloud.stream.model.Person;
import training.springcloud.stream.publisher.MessagePublisher;

@RestController("api/publish/person")
public class PersonController {

	@Autowired
	private MessagePublisher publisher;

	@PostMapping
	public String publishPerson() {
		Person person = new Person(UUID.randomUUID(), "Zack");
		publisher.publishPersonObject().send(MessageBuilder.withPayload(person).build());
		return "Person published";
	}

}
