package org.studyeasy;

public class Person {
	private String name;
	private int age;
	private String gender;





	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}





	public Person() {
		// TODO Auto-generated constructor stub
	}





	public String getName() {
		return name;
	}





	public boolean setAge(int age) {
		if(age >= 0) {
			this.age = age;
			return true;
		} return false;
	}





	public int getAge() {
		return age;
	}





	public void setName(String name) {
		this.name = name;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getGender() {
		return gender;
	}





	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
