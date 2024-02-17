package burzynski.swimmingPool;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@RequiredArgsConstructor
@MappedSuperclass

public abstract class User {

	@Setter @Getter private	String name;
	@Setter @Getter private	String surname;
	@Getter @Setter private	LocalDate birthDate;
	@Getter private	String emailAddress;
	@Getter private int phoneNumber;
	@Getter private String username;
	private String password;
	
	//additional constructors
	
	public User(String name, String surname, LocalDate birthDate, int phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}

	public User(String name, String surname, LocalDate birthDate, String emailAddress) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.emailAddress = emailAddress;
	}
	
	
	//additional getters, setters
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhoneNumber(int phoneNumber) {

		this.phoneNumber = phoneNumber;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {

		return password; // wprowadzić ograniczenia
	}

	public void setPassword(String password) {

		this.password = password; // wprowadzić ograniczenia
	}	
	
	// other methods 
	public int calculateAge() {

        LocalDate currentDate = LocalDate.now();
        return birthDate.until(currentDate).getYears();
    }
		
		
		
		
		
}
