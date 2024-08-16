package nabil.com.demo.portfolio.Services.Imp;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.DTO.UserDto;
import nabil.com.demo.portfolio.Entity.User;
import nabil.com.demo.portfolio.Mappers.UserMapper;
import nabil.com.demo.portfolio.Repository.UserRepository;
import nabil.com.demo.portfolio.Services.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
         user = userRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    public UserDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return userMapper.toDTO(user);
    }
}
