package lt.mano.projektai.drawing_lots.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "participants")
public class ParticipantEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false)
    private UUID participantId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String password;
    @Column
    private String desiredGift;
    @Column
    private String unwantedGift;
    @Column(columnDefinition = "uuid")
    private UUID electedId;
    @ManyToOne
    @JoinColumn(name = "eventId")
    private EventEntity event;

}
