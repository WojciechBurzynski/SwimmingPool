package burzynski.swimmingPool;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/employees")
@RequiredArgsConstructor

public class EmployeeController {

	private final EmployeeService employeeService;

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{idEmployee}")
	void deleteEmployee(@PathVariable UUID idEmployee) {
		employeeService.deleteEmployee(idEmployee);
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping("{idEmployee}")
	Employee updateEmployee(@RequestBody Employee employee, @PathVariable UUID idEmployee) {
		return employeeService.updateEmployee(employee, idEmployee);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping
	List<Employee> getEmployee() {
		return employeeService.getEmployees();
	}

	@GetMapping("{idEmployee}")
	User getEmployee(@PathVariable UUID idEmployee) {
		return employeeService.getEmployee(idEmployee);
	}
}
