package fr.fitec.projet.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.fitec.projet.entity.User;

@Component 		//ou bien @Repository
@Transactional  //version spring
public class DaoUser implements IDao<User> {

	@PersistenceContext(unitName="myPersistenceUnit")		//injection + initialisation connexion base
	private EntityManager entityManager;	//de JPA
	
	
	public List<User> selectAll() {
		
		// marcherai mais en passant par les named query (dans le fichier auteur) c'est + rapide
		//return entityManager.createQuery("SELECT a FROM User a", User.class).getResultList();
		
		return entityManager.createNamedQuery("user.all", User.class)
				//.setParameter(...,...)
				.getResultList();
	}
	
}
