package logic;

public class pesCov {

		
		public Person setPersonAndReturnUsername(String name, String surname, String address, String ncard) {
			
			name.toUpperCase();
			surname.toUpperCase();
			address.toUpperCase();
			Person a = new Person(name, surname, address, ncard);
			return a;
			
		}
}
