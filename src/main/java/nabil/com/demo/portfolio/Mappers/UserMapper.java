package nabil.com.demo.portfolio.Mappers;




import nabil.com.demo.portfolio.DTO.UserDto;
import nabil.com.demo.portfolio.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDTO(User user);

    User toEntity(UserDto userDTO);

    List<UserDto> toDTOList(List<User> users);

    List<User> toEntityList(List<UserDto> userDTOs);
}