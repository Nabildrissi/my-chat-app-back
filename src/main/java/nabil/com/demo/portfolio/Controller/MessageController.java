package nabil.com.demo.portfolio.Controller;

import nabil.com.demo.portfolio.Constants.Endpoints;
import nabil.com.demo.portfolio.DTO.MessageDto;
import nabil.com.demo.portfolio.Services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Endpoints.Messages)
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
//sending message to room
    @PostMapping("/send")
    public ResponseEntity<MessageDto> sendMessage(@RequestBody MessageDto messageDto) {
        return new ResponseEntity<>(messageService.sendMessage(messageDto), HttpStatus.OK);
    }
}
