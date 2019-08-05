package training.springcloud.stream.publisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessagePublisher {

	@Output("MessageBinding")
	public MessageChannel sendMessage();

}
