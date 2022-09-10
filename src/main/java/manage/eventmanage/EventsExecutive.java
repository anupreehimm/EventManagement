package manage.eventmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventsExecutive {
	@Autowired
	EventsService serv;
	
	@PostMapping("/new")
	public Events callCreate(@RequestBody Events eve) {
		System.out.println(eve.toString());
		return serv.makeAdd(eve);
	}
}
