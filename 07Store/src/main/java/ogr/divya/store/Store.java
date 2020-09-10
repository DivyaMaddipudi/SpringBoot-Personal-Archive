package ogr.divya.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Store {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/samsung")
	public ModelAndView samsung() {
		ModelAndView modelAndView = new ModelAndView("samsung");
		
		//connect with the microservice
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://localhost:8082/samsung/devices", String.class);
		
		modelAndView.addObject("devices", result);
		return modelAndView;
	}
}
