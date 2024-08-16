package nabil.com.demo.portfolio.Entity;



import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;



import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String sender;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "chatroom_id")
    private ChatRoom chatRoom;

    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attachement> attachments;

    @PrePersist
    protected void onCreate() {
        this.timestamp = LocalDateTime.now();
    }
}