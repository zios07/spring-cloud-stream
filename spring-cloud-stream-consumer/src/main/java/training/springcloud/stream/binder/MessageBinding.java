package training.springcloud.stream.binder;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageBinding {

	@Input("AnimalBinding")
	SubscribableChannel receiveAnimalMessage();

	@Input("PersonBinding")
	SubscribableChannel receivePersonMessage();

}
