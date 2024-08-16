package nabil.com.demo.portfolio.Mappers;



import nabil.com.demo.portfolio.DTO.ChatroomDto;
import nabil.com.demo.portfolio.Entity.ChatRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatRoomMapper {

    ChatroomDto toDTO(ChatRoom chatRoom);

    ChatRoom toEntity(ChatroomDto chatroomDto);

    List<ChatroomDto> toDTOList(List<ChatRoom> chatRooms);

    List<ChatRoom> toEntityList(List<ChatroomDto> chatroomDtos);
}