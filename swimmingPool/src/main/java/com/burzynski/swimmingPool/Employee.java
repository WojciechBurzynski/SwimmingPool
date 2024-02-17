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

public class Employee extends User {
	@Id
	@Getter private UUID idEmployee;

	@Getter private String employeeAccessLevel;
	@Getter private String employeeWorkZone;
	
	//constructors
	
	public Employee(String name) {
		this.setName(name); 
		this.setIdEmployee(UUID.randomUUID());
	}
	
	public Employee(UUID idEmployee, String name) {
		this.setName(name); 
		this.setIdEmployee(idEmployee);
	}
	
	public Employee(UUID idEmployee, String name, String surname, LocalDate birthDate, String emailAddress, int phoneNumber) {
		this.setIdEmployee(idEmployee);
		this.setName(name); 
		this.setSurname(surname); 
		this.setBirthDate(birthDate); 
		this.setPhoneNumber(phoneNumber);
		this.setEmailAddress(emailAddress);
	}
	
	//getters, setters
	
	public void setIdEmployee(UUID idEmployee) {

		this.idEmployee = idEmployee;
	}
	public void setEmployeeAccessLevel(String employeeAccessLevel) {
		this.employeeAccessLevel = employeeAccessLevel; //zmienic żeby employee nie mógł sobie sam nadać dostępów 
	}

	public void setEmployeeWorkZone(String employeeWorkZone) {
		this.employeeWorkZone = employeeWorkZone;
	} 
	
	
}
