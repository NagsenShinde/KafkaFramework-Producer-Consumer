package kafka.RestAPI1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kafka.RestAPI1.service.ServiceClass;
 
@RestController
public class Controller {
	private  ServiceClass serviceClass;
 
	public Controller(ServiceClass serviceClass) {
		this.serviceClass = serviceClass;
	}
	@GetMapping(value="/abc")
	public String sendMessage1(@RequestParam("send") String send)
	{	
		serviceClass.sendMessage(send);
		return"Message send Sucessfullly";	
	}	
	
}
