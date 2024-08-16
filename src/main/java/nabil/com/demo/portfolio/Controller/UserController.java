package nabil.com.demo.portfolio.Controller;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.Constants.Endpoints;
import nabil.com.demo.portfolio.DTO.UserDto;
import nabil.com.demo.portfolio.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Endpoints.Users)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
@PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody  UserDto userDto){
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }
 @GetMapping
 public ResponseEntity<UserDto> getUsers(@RequestParam String username){
    return new ResponseEntity<>(userService.getUserByUsername(username), HttpStatus.OK);
 }
}
