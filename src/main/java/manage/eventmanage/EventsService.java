package manage.eventmanage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventsService {
	@Autowired
	EventsInterface repo;
	
	
	public String makeDelete(Events eve)
	{
		String msg=eve.getEveLocation()+"has been Deleted";
		repo.delete(eve);
		return msg;
	}
	
	public List<Events> makeFetchAll(){
		return (List<Events>) repo.findAll();
	}
	
	public Events makeAdd(Events eve) {
		return repo.save(eve);
	}
}
