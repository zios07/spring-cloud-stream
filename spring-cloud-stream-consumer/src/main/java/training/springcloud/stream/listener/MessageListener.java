package training.springcloud.stream.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import training.springcloud.stream.model.Person;

@Component
public class MessageListener {

	@StreamListener(target = Sink.INPUT)
	public void processCheapMeals(String message) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Person person = gson.fromJson(message, Person.class);
		System.out.println("Received new Person  : ");
		System.out.println(person.getId() + " - " + person.getFirstName());
	}

}
