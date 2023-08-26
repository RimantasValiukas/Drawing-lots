package lt.mano.projektai.drawing_lots.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private UUID eventId;
    private String name;
    private String password;
    private boolean registrationStatus;
    private List<Participant> participants;

}
