package ogr.divya.store;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
		
		ModelAndView modelAndView;
		RestTemplate restTemplate;
		Devices result;
		
		switch (brandName.toLowerCase()) {
		case "samsung":
			 modelAndView = new ModelAndView("viewDevices");
			
			//connect with the microservice
			 restTemplate = new RestTemplate();
			 result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			
			modelAndView.addObject("devices", result);
			return modelAndView;
			
		case "apple":
			 modelAndView = new ModelAndView("viewDevices");
			
			//connect with the microservice
			 restTemplate = new RestTemplate();
			 result = restTemplate.getForObject("http://APPLE/apple/devices", Devices.class);
			
			modelAndView.addObject("devices", result);
			return modelAndView;
			
		default:
			return new ModelAndView("redirect: /error");
		}
		
	}
}
