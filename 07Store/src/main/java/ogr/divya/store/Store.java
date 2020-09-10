package ogr.divya.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import ogr.divya.model.Devices;

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
		Devices result = restTemplate.getForObject("http://localhost:8082/samsung/devices", Devices.class);
		
		modelAndView.addObject("devices", result);
		return modelAndView;
	}
	
	@RequestMapping("/apple")
	public ModelAndView apple() {
		ModelAndView modelAndView = new ModelAndView("apple");
		
		RestTemplate restTemplate = new RestTemplate();
		Devices result = restTemplate.getForObject("http://localhost:8083/apple/devices", Devices.class);
		
		modelAndView.addObject("appleDevices", result);
		return modelAndView;
	}
}
