package manage.eventmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EventsExecutive {
	@Autowired
	EventsService serv;
	
	@DeleteMapping("/dele")
	public String callDelete(@RequestBody Events eve)
	{
		return serv.makeDelete(eve);
	}
	@GetMapping("/")
	public List<Events> callFetching()
	{
		return serv.makeFetchAll();
	}
	
	
	@PostMapping("/new")
	public Events callCreate(@RequestBody Events eve) {
		System.out.println(eve.toString());
		return serv.makeAdd(eve);
	}
}
