package lt.mano.projektai.drawing_lots.repository;

import lt.mano.projektai.drawing_lots.entity.ParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantRepository extends JpaRepository<ParticipantEntity, UUID> {

}
