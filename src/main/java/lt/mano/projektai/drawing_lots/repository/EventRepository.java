package lt.mano.projektai.drawing_lots.repository;

import lt.mano.projektai.drawing_lots.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<EventEntity, UUID> {
}
