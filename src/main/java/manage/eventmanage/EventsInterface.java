package manage.eventmanage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsInterface extends JpaRepository<Events, Integer>{

}
