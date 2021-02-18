package logic;

public class Person {
	
	private String name;
	private String surname;
	private String address;
	private String nCard;
	
	public Person(String name, String surname, String address, String ncard) {
		
		setName(name);
		setSurname(surname);
		setAddress(address);
		setnCard(ncard);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setnCard(String nCard) {
		this.nCard = nCard;
	}
}
