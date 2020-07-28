package tr.com.mehmettasan.ilacim.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
 
@Entity
@Table(name="ilac")
public class Ilac {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ilacSeqGen")
	@SequenceGenerator(name="ilacSeqGen",sequenceName="ilac_sequence")
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIlacName() {
		return ilacName;
	}

	public void setIlacName(String ilacName) {
		this.ilacName = ilacName;
	}

	@Column(name="ilacName")
	private String ilacName;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", ilacName=" + ilacName + "]";
	}
	
	
}
