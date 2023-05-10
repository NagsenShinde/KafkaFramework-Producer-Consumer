package kafka.RestAPI1.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import kafka.RestAPI1.util.Topic;

@Service
public class ServiceClass {
	private static Logger log = Logger.getLogger(ServiceClass.class);
	 public static KafkaTemplate<String,String> kafkaTemplate;
	 
      public ServiceClass(KafkaTemplate<String, String> kafkaTemplate) {
    	 ServiceClass.kafkaTemplate=kafkaTemplate;
     }
   
	 public void sendMessage(String send)
	 {
	     //BasicConfigurator.configure();
		 log.info("Message send--->"+send);
		 log.debug(send);
		 log.error(send);
		 log.fatal(send);
		 System.out.println(send);
		  kafkaTemplate.send(Topic.topicName, send);
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();
		   log.info("Message send date--->"+dtf.format(now));	  
	 }

}  
