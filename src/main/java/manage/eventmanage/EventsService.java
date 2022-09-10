package manage.eventmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsService {
	@Autowired
	EventsInterface repo;
	
	public Events makeAdd(Events eve) {
		return repo.save(eve);
	}
}
