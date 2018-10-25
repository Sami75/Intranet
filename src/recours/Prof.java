package recours;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.SortNatural;

import back.Passerelle;

@Entity
@PrimaryKeyJoinColumn(name = "idUser")
public class Prof extends User {

	private String matiere;
}
