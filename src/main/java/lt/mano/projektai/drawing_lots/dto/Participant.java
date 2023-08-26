package lt.mano.projektai.drawing_lots.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participant {
    private UUID participantId;
    private String name;
    private String lastname;
    private String password;
    private String desiredGift;
    private String unwantedGift;
    private UUID electedId;

}
