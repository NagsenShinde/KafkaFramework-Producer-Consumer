package kafka.RestAPI1.producer;
 
import java.util.Date;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="consumerteacher")
public class ProducerEntityClass<student> {
 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 @Column(name="SFirstName")
	 private String studentFName;
	
	@Column(name="SLastName")
	private String studentName;
	 
	public String getStudentFName() {
		return studentFName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="date")
	private Date date;
 
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
//	private List<student> studnets;
//
//	public List<student> getEmployee() {
//		return studnets;
//	}
//
//	public void setEmployee(List<student> studnet) {
//		
//		if(this.studnets == null) {
//			this.studnets = new ArrayList<>();
//		}
//		this.studnets.addAll(studnet);
//	}

	}
	 
	
	
 

