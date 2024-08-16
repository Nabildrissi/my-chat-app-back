package nabil.com.demo.portfolio.Services;

import nabil.com.demo.portfolio.DTO.MessageDto;
import nabil.com.demo.portfolio.Entity.ChatRoom;
import nabil.com.demo.portfolio.Entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MessageService {

     MessageDto sendMessage(MessageDto messageDto);
}
