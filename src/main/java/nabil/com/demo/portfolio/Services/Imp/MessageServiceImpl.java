package nabil.com.demo.portfolio.Services.Imp;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.DTO.MessageDto;
import nabil.com.demo.portfolio.Entity.Message;
import nabil.com.demo.portfolio.Mappers.MessageMapper;
import nabil.com.demo.portfolio.Repository.MessageRepository;
import nabil.com.demo.portfolio.Services.MessageService;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    @Override
    public MessageDto sendMessage(MessageDto messageDto) {
        Message message = messageMapper.toEntity(messageDto);
        message = messageRepository.save(message);
        return messageMapper.toDto(message);
    }
}
