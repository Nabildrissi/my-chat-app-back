package nabil.com.demo.portfolio.Mappers;

import nabil.com.demo.portfolio.DTO.MessageDto;
import nabil.com.demo.portfolio.Entity.Message;
import org.mapstruct.Mapper;


import nabil.com.demo.portfolio.DTO.MessageDto;
import nabil.com.demo.portfolio.Entity.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MessageDto toDto(Message message);
    Message toEntity(MessageDto messageDto);
}