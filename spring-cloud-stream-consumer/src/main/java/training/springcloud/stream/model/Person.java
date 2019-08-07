package training.springcloud.stream.model;

public class Person {

	private String id;

	private String firstName;

	public Person() {
	}

	public Person(String id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
