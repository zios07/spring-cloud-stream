package training.springcloud.stream.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import training.springcloud.stream.model.Animal;
import training.springcloud.stream.model.Person;

@Component
public class MessageListener {

	@StreamListener(target = "PersonBinding")
	public void listenToPersonMessages(String message) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Person person = gson.fromJson(message, Person.class);
		System.out.println("Received new Person  : ");
		System.out.println(person.getId() + " - " + person.getFirstName());
	}

	@StreamListener(target = "AnimalBinding")
	public void listenToAnimalMessages(String message) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Animal animal = gson.fromJson(message, Animal.class);
		System.out.println("Received new Animal  : ");
		System.out.println(animal.getId() + " - " + animal.getName());
	}

}
