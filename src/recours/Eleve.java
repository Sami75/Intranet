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
public class Eleve extends User {

	private String classe, nom, prenom, adresse, ville, mail, status;
	
	private int idCard;
}
