package recours;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.SortNatural;

import back.Passerelle;

@Entity
public class Chat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	private String message;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnvoie;
	
	@ManyToOne
	@JoinColumn(name="idUserA", nullable=false)
	private User userA;
	
	@ManyToOne
	@JoinColumn(name="idUserB", nullable=false)
	private User userB;
}
