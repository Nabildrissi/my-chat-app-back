package nabil.com.demo.portfolio.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nabil.com.demo.portfolio.Entity.Message;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatroomDto {

    private Long id;


    private String name;

    private LocalDateTime createdAt = LocalDateTime.now();

}
