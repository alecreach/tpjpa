package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		// TODO create entity
		//Long id, String adresse, int superficie, String adresseIP
		Home home1 = new Home("12 rue osef",45,"adresseip1");
		Home home2 = new Home("15 rue osef",44,"adresseip2");
		Home home3 = new Home("175 rue osef",457,"adresseip3");
		
//		List<Home> liste1 = new ArrayList<Home>();
//		List<Home> liste2 = new ArrayList<Home>();
//		
//		liste1.add(home1);
//		liste1.add(home2);
//		liste2.add(home3);
		
		Person personne1 = new Person("Maurice", "Obliger", "Male", "aimeOlbige@azerty.gr", "25/58/3500", "lolTaVuJaime",new ArrayList<Home>(Arrays.asList(home1,home2)));
		Person personne2 = new Person("Jean","Valjean","Male","jvaljean]hotmail.fr","25/11/1874","jvalj.fr",new ArrayList<Home>(Arrays.asList(home3)));
		
//		Long id, String prenom, String nom, String genre,
//		String mail, String date, String profilFb) 
		

		
		// TODO persist entity
		manager.persist(personne1);
		manager.persist(personne2);
//		manager.persist(home1);
//		manager.persist(home2);
//		manager.persist(home3);
		// TODO run request
		tx.commit();		

		System.out.println(".. done");
	}

}
