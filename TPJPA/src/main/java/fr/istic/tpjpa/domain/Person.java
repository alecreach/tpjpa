package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	private Long id;

	private String prenom;
	private String nom;
	private String genre;

	private String mail;
	private String date;
	private String profilFb;

	private List<Home> homes = new ArrayList<Home>();

	public Person() {
	};

	public Person(String prenom, String nom, String genre, String mail,
			String date, String profilFb) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.mail = mail;
		this.date = date;
		this.profilFb = profilFb;
		// this.homes = homes;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProfilFb() {
		return profilFb;
	}

	public void setProfilFb(String profilFb) {
		this.profilFb = profilFb;
	}

	@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
	public List<Home> getHomes() {
		return this.homes;
	}

	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}

	@Override
	public String toString() {
		return "Person [ID = " + id + ", Prénom = " + prenom + ", Nom = " + nom + ", E-mail = " + mail +", Genre = "+ genre + ", Date de naissance = "+ date + ", Profil Facebook = "+ profilFb+"]";
	}
}
