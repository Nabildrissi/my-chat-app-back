package nabil.com.demo.portfolio.Mappers;

import nabil.com.demo.portfolio.DTO.AttachementDto;
import nabil.com.demo.portfolio.Entity.Attachement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface AttachementMapper {

    AttachementDto toDto(Attachement attachement);

    Attachement toEntity(AttachementDto attachementDto);
}
