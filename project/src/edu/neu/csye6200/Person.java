package edu.neu.csye6200;

public class Person {
	
	public int age = 0;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String firstName, char mi, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.mi = mi;
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public char getMi() {
		return mi;
	}
	public void setMi(char mi) {
		this.mi = mi;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName = "John";
	private char mi = 'C';
	private String lastName = "Doe";
	
	@Override
	public String toString() {
		return "I am: " + firstName + " " + mi +". " + lastName + ", " + age +" years of age!";
	}
	
}
