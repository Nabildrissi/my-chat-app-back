package nabil.com.demo.portfolio.Controller;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.Constants.Endpoints;
import nabil.com.demo.portfolio.DTO.ChatroomDto;
import nabil.com.demo.portfolio.Entity.ChatRoom;
import nabil.com.demo.portfolio.Services.ChatRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Endpoints.Room)
@RequiredArgsConstructor
public class ChatRoomController {
    private final ChatRoomService chatRoomService;
@PostMapping("/create")
    public ResponseEntity<ChatroomDto> createChatRoom(@RequestBody ChatroomDto chatroomDto){
        return new ResponseEntity<>(chatRoomService.createChatRoom(chatroomDto), HttpStatus.CREATED);
    }
@GetMapping("/find")
    public ResponseEntity<ChatroomDto> FindroomByName(@RequestParam String name){
        return  new ResponseEntity<>(chatRoomService.getChatRoomByName(name), HttpStatus.OK);
    }
}
