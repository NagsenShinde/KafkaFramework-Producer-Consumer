package kafka.RestAPI1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kafka.RestAPI1.producer.ProducerEntityClass;
import kafka.RestAPI1.service.ServiceClass;

public interface ProducerStudentRepository extends JpaRepository<ProducerEntityClass,Integer>{

	//void save(ServiceClass serviceClass);

}
