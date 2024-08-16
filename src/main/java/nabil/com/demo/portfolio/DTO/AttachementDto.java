package nabil.com.demo.portfolio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachementDto {
    private Long id;
    private String Name;
    private String fileName;
    private String fileType;
    private String url;
}
