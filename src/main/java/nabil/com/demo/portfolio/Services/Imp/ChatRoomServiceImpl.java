package nabil.com.demo.portfolio.Services.Imp;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.DTO.ChatroomDto;
import nabil.com.demo.portfolio.Entity.ChatRoom;
import nabil.com.demo.portfolio.Mappers.ChatRoomMapper;
import nabil.com.demo.portfolio.Repository.ChatRoomRepository;
import nabil.com.demo.portfolio.Services.ChatRoomService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatRoomServiceImpl implements ChatRoomService {
    private final ChatRoomMapper chatRoomMapper;
    private final ChatRoomRepository chatRoomRepository;
    @Override
    public ChatroomDto createChatRoom(ChatroomDto chatroomDto) {
        ChatRoom chatRoom = chatRoomMapper.toEntity(chatroomDto);
        chatRoom = chatRoomRepository.save(chatRoom);
        return chatRoomMapper.toDTO(chatRoom);
    }

    @Override
    public ChatroomDto getChatRoomByName(String name) {
        ChatRoom chatRoom = chatRoomRepository.findByName(name);
        return chatRoomMapper.toDTO(chatRoom);
    }
}
