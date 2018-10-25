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
public class Pointage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datePointage;
	
	@ManyToOne
	@JoinColumn(name="idUser", nullable=false)
	private User user;
}
