package burzynski.swimmingPool;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor

public class Client extends User {

	@Id
	@Getter private UUID idClient;

	@Getter private String chosenPaymentMethod;
	@Getter private String chosenTimePreferences;
	@Getter private int chosenEntrancesQuantity;
	@Getter private String chosenTicketCollectionArea;
	
	//constructors
	
	public Client(String name) {
		this.setName(name); 
		this.setIdClient(UUID.randomUUID());
	}
	
	public Client(UUID idClient, String name) {
		this.setName(name); 
		this.setIdClient(idClient);
	}
	
	public Client(UUID idClient, String name, String surname, LocalDate birthDate, int phoneNumber) {
		this.setIdClient(idClient);
		this.setName(name); 
		this.setSurname(surname); 
		this.setBirthDate(birthDate); 
		this.setPhoneNumber(phoneNumber); 
	}

	public Client(UUID idClient, String name, String surname, LocalDate birthDate, String emailAddress) {
		this.setIdClient(idClient);
		this.setName(name); 
		this.setSurname(surname); 
		this.setBirthDate(birthDate); 
		this.setEmailAddress(emailAddress);
	}
	
	//getters, setters 

	public void setChosenPaymentMethod(String chosenPaymentMethod) {
		this.chosenPaymentMethod = chosenPaymentMethod;
	}
	public void setChosenTimePreferences(String chosenTimePreferences) {
		this.chosenTimePreferences = chosenTimePreferences;
	}
	public void setChosenEntrancesQuantity(int chosenEntrancesQuantity) {
		this.chosenEntrancesQuantity = chosenEntrancesQuantity;
	}
	public void setChosenTicketCollectionArea(String chosenTicketCollectionArea) {
		this.chosenTicketCollectionArea = chosenTicketCollectionArea;
	}
	public void setIdClient(UUID idClient) {

		this.idClient = idClient;
	}
}
