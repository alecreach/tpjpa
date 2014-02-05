package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Home {

	private Long homeId;
	private String adresse;
	private int superficie;
	private String adresseIP;
	private Person person;

	public Home() {
	}

	public Home(String adresse, int superficie, String adresseIP, Person person) {
		super();
		this.adresse = adresse;
		this.superficie = superficie;
		this.adresseIP = adresseIP;
		this.person = person;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return homeId;
	}

	public void setId(Long id) {
		this.homeId = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getAdresseIP() {
		return adresseIP;
	}

	public void setAdresseIP(String adresseIP) {
		this.adresseIP = adresseIP;
	}

	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
