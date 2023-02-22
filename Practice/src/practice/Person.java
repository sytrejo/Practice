package practice;

public class Person {
	
	//these are the characteristics of a person
	//instance variables 
	String name;
	int age;
	int height;
	String nationality;
	
	//constructor is a method that lets us create objects
	public Person(String name, int age, int height, String nationality)
	{
		//the this in a constructor refers to the instance variables of an object created by calling the constructor
		this.name = name;
		this.age = age;
		this.height= height;
		this.nationality= nationality;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String getNationality() {
		return this.nationality;
	}
	


}
