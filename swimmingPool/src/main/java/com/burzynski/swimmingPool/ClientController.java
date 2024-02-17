package burzynski.swimmingPool;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/clients")
@RequiredArgsConstructor

public class ClientController {

	private final ClientService clientService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	Client createClient(@RequestBody Client client){
		return clientService.createClient(client);
	}

	@GetMapping
	List<Client> getClients(){
		return clientService.getClients();
	}

	@GetMapping("{idClient}")
	User getClient(@PathVariable UUID idClient){
		return clientService.getClient(idClient);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{idClient}")
	void deleteClient(@PathVariable UUID idClient){
		clientService.deleteClient(idClient);
		}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping("{idClient}")
	Client updateClient(@RequestBody Client client, @PathVariable UUID idClient){
		return clientService.updateClient(client, idClient);
	}

//	@ResponseStatus(HttpStatus.ACCEPTED)
//	@PatchMapping("{idClient}")
//	Client partiallyUpdateClient(@RequestBody Client client, @PathVariable UUID idClient){
//		return clientService.partiallyUpdateClient(client, idClient);
//	}
}
