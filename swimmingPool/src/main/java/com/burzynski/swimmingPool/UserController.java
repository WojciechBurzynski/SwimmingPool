package burzynski.swimmingPool;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")

public class UserController {

        @ResponseStatus(HttpStatus.NO_CONTENT)
        @DeleteMapping("{id}")
        void deleteUser(@PathVariable UUID id){

            System.out.println("delete" + id);
        }

        @ResponseStatus(HttpStatus.ACCEPTED)
        @PutMapping("{id}")
        User updateUser(@PathVariable UUID id, @RequestBody User user){
            user.setName(user.getName()+" updated");
            return user;
        }

        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping
        User createUser(@RequestBody User user){
            return user;
        }


}
