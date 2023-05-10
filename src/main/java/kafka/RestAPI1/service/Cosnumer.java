package kafka.RestAPI1.service;
 
import org.apache.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import kafka.RestAPI1.util.Topic;
@Service
public class Cosnumer {
	private static Logger log = Logger.getLogger(Cosnumer.class);
	@KafkaListener(topics =Topic.topicName,id=Topic.groupId)

	public void receiveMessage(String recive)
	{
		log.info("Message receive----->"+recive);
		 
	 
		
	}


}
