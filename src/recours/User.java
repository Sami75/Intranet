package recours;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.SortNatural;

import back.Passerelle;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	private String login, password, nom, prenom, adresse, ville, mail, status, classe;
	
	private int cdp, tel;
	
	@OneToMany(mappedBy="user")
	private Set<Pointage> pointage;
	
//	@OneToMany(mappedBy="user")
//	private Set<Chat> Chat;
	
	/**
	 * Retourne le nom de l'utilisateur.
	 * @return
	 */
	
	public String getNom()
	{
		return nom;
	}
	
}
