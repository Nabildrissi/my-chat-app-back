package nabil.com.demo.portfolio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String password;

    private String email;
    private String profilePicture;
    private LocalDateTime createdAt;
    private  LocalDateTime	updatedAt;
}
