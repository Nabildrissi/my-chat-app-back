package nabil.com.demo.portfolio.Services;

import nabil.com.demo.portfolio.DTO.ChatroomDto;
import nabil.com.demo.portfolio.Entity.ChatRoom;

public interface ChatRoomService {
    ChatroomDto createChatRoom(ChatroomDto chatroomDto);
    ChatroomDto getChatRoomByName(String name);
}
