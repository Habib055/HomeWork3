package Animal;

public class Animal {

	String name, country;
	int weight, height;
	double price;

public Animal(String name, String country) {
	this.name= name;
	this.country= country;
}

public Animal(int weight, int height) {
	this.weight= weight;
	this.height= height;
}
	
public Animal(double price) {
	this.price= price;
}

public void setName(String name) {
	this.name= name;
}
	
public String getname() {
	return name;
	
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

}
