package training.springcloud.stream.model;

import java.util.UUID;

public class Animal {

	private UUID id;

	private String name;

	public Animal() {

	}

	public Animal(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
