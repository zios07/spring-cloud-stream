package training.springcloud.stream.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@StreamListener(target = Sink.INPUT)
	public void processCheapMeals(String message) {
		System.out.println("Received message : " + message);
	}

}
