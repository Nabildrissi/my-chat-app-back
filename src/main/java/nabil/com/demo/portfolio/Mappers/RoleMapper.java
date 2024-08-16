package nabil.com.demo.portfolio.Mappers;

import nabil.com.demo.portfolio.DTO.RoleDto;
import nabil.com.demo.portfolio.Entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDto toDTO(Role role);

    Role toEntity(RoleDto roleDTO);

    List<RoleDto> toDTOList(List<Role> roles);

    List<Role> toEntityList(List<RoleDto> roleDTOs);
}