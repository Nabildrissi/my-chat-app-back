package nabil.com.demo.portfolio.Controller;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.Constants.Endpoints;
import nabil.com.demo.portfolio.DTO.AttachementDto;
import nabil.com.demo.portfolio.Services.AttachementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.Attachement)
@RequiredArgsConstructor
public class AttachementController {
    private final AttachementService attachementService;
    @PostMapping("/sendAttachement")
    public ResponseEntity<AttachementDto> sendAttachement(@RequestBody AttachementDto attachementDto){
        return new ResponseEntity<>(attachementService.sendAttachement(attachementDto), HttpStatus.OK);
    }
}
