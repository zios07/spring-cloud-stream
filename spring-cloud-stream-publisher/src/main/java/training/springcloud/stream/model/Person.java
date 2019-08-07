package training.springcloud.stream.model;

import java.util.UUID;

public class Person {

	private UUID id;

	private String firstName;

	public Person(UUID id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
