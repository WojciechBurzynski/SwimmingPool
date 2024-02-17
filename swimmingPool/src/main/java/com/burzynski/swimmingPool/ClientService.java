package burzynski.swimmingPool;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class ClientService {

    private final ClientRepository clientRepository;

    public User getClient(UUID idClient) {
        return clientRepository.findById(idClient).orElseThrow();
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client createClient(Client client) {
        client.setIdClient(UUID.randomUUID());
        return clientRepository.save(client);
    }

    public void deleteClient(UUID idClient) {
        clientRepository.deleteById(idClient);
    }

    public Client updateClient(Client client, UUID idClient) {
        Client clientToUpdate = clientRepository.findById(idClient).orElseThrow();
        clientToUpdate.setName(client.getName());
        clientToUpdate.setSurname(client.getSurname());
        clientToUpdate.setChosenEntrancesQuantity(client.getChosenEntrancesQuantity());
        clientToUpdate.setChosenPaymentMethod(client.getChosenPaymentMethod());
        clientToUpdate.setChosenTimePreferences(client.getChosenTimePreferences());
        clientToUpdate.setChosenTicketCollectionArea(client.getChosenTicketCollectionArea());
        clientToUpdate.setBirthDate(client.getBirthDate());
        clientToUpdate.setEmailAddress(client.getEmailAddress());
        clientToUpdate.setPhoneNumber(client.getPhoneNumber());
        clientToUpdate.setUsername(client.getUsername());
        clientToUpdate.setPassword(client.getPassword());
        clientToUpdate.setIdClient(client.getIdClient());
        return clientRepository.save(clientToUpdate);
    }
//
//    public static void applyPartialUpdates(Object existingObject, Object partialObject, String... fieldNames) {
//        for (String fieldName : fieldNames) {
//            try {
//                Field field = existingObject.getClass().getDeclaredField(fieldName);
//                field.setAccessible(true);
//                Object partialValue = field.get(partialObject);
//                if (partialValue != null) {
//                    field.set(existingObject, partialValue);
//                }
//            } catch (Exception e) {
//               //needs handling
//            }
//        }
//    }
//
//    public Client partiallyUpdateClient(Client partialClient, UUID idClient) {
//        Client clientToUpdate = clientRepository.findById(idClient).orElseThrow();
//
//        clientPartialUpdate(partialClient, getName,  clientToUpdate, setName);
//
//        userPartialUpdate(Client partialClient, partialClient.getName(), clientToUpdate.setName);
//
//        if (partialClient.getName() != null) {
//            clientToUpdate.setName(partialClient.getName());
//        }
//
//        clientToUpdate.setName(partialClient.getName());
//        clientToUpdate.setSurname(partialClient.getSurname());
//        clientToUpdate.setChosenEntrancesQuantity(partialClient.getChosenEntrancesQuantity());
//        clientToUpdate.setChosenPaymentMethod(partialClient.getChosenPaymentMethod());
//        clientToUpdate.setChosenTimePreferences(partialClient.getChosenTimePreferences());
//        clientToUpdate.setChosenTicketCollectionArea(partialClient.getChosenTicketCollectionArea());
//        clientToUpdate.setBirthDate(partialClient.getBirthDate());
//        clientToUpdate.setEmailAddress(partialClient.getEmailAddress());
//        clientToUpdate.setPhoneNumber(partialClient.getPhoneNumber());
//        clientToUpdate.setUsername(partialClient.getUsername());
//        clientToUpdate.setPassword(partialClient.getPassword());
//        clientToUpdate.setIdClient(partialClient.getIdClient());
//        return clientRepository.save(clientToUpdate);
//    }
}