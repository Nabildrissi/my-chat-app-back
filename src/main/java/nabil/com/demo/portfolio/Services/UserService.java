package nabil.com.demo.portfolio.Services;

import nabil.com.demo.portfolio.DTO.UserDto;
import nabil.com.demo.portfolio.Entity.User;

import java.time.LocalDateTime;

public interface UserService {
        UserDto createUser(UserDto userDto);
        UserDto getUserByUsername(String username);

}
