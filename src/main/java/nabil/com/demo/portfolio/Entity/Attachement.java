package nabil.com.demo.portfolio.Entity;



import lombok.Data;
import jakarta.persistence.*;

@Entity

@Data
public class Attachement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String fileType;
    private String url;

    @ManyToOne
    private Message message;
}
