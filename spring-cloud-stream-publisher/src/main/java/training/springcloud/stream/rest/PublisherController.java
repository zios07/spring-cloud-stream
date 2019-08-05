package training.springcloud.stream.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import training.springcloud.stream.publisher.MessagePublisher;

@RestController("messages/send")
public class PublisherController {

	@Autowired
	private MessagePublisher publisher;

	@GetMapping("send/{message}")
	public String sendMessage(@PathVariable String message) {
		publisher.sendMessage().send(MessageBuilder.withPayload(message).build());
		return "Message published";
	}

	@GetMapping
	public String sendRandomMessage() {
		String message = "This is a random message : " + System.currentTimeMillis();
		publisher.sendMessage().send(MessageBuilder.withPayload(message).build());
		return "Message published";
	}

}
