package burzynski.swimmingPool;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public Employee getEmployee(UUID idEmployee) {

        return employeeRepository.findById(idEmployee).orElseThrow();
    }

    public List<Employee> getEmployees() {

        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        employee.setIdEmployee(UUID.randomUUID());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(UUID idEmployee) {
        employeeRepository.deleteById(idEmployee);
    }

    public Employee updateEmployee(Employee employee, UUID idEmployee) {
        Employee employeeToUpdate = employeeRepository.findById(idEmployee).orElseThrow();
        employeeToUpdate.setName(employee.getName());
        employeeToUpdate.setSurname(employee.getSurname());
        employeeToUpdate.setBirthDate(employee.getBirthDate());
        employeeToUpdate.setEmailAddress(employee.getEmailAddress());
        employeeToUpdate.setPhoneNumber(employee.getPhoneNumber());
        employeeToUpdate.setUsername(employee.getUsername());
        employeeToUpdate.setPassword(employee.getPassword());
        employeeToUpdate.setIdEmployee(employee.getIdEmployee());
        return employeeRepository.save(employee);
    }
}
