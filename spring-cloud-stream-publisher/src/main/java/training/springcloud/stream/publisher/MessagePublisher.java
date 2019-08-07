package training.springcloud.stream.publisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessagePublisher {

	@Output("PersonBinding")
	public MessageChannel publishPersonObject();

	@Output("AnimalBinding")
	public MessageChannel publishAnimalObject();

}
