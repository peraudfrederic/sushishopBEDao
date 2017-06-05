package fr.fitec.projet.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.fitec.projet.dao.DaoUser;
import fr.fitec.projet.dao.IDao;
import fr.fitec.projet.entity.User;
import junit.framework.TestCase;

public class TestDaoUser extends TestCase {
	
	//private ApplicationContext context = new ClassPathXmlApplicationContext("../../../../../main/ressources/applicationContext.xml");
	private ApplicationContext context;

	@Test
	public void testSelectAll() {
		
		System.out.println("Test Select all:");
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IDao<User> daoUser = new DaoUser();
		
		List<User> usrs = daoUser.selectAll();
		
		usrs.forEach(u->System.out.println(u) );
				
	}
	
}
