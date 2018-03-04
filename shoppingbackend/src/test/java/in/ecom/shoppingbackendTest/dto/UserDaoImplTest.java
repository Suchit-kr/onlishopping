package in.ecom.shoppingbackendTest.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import in.ecom.shoppingbackend.dao.UserDao;
import in.ecom.shoppingbackend.daoimpl.UserDaoImpl;
import in.ecom.shoppingbackend.dto.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class UserDaoImplTest {

	@Configuration
	static class ContextConfiguration {

        // this bean will be injected into the userDao class
        @Bean
        public UserDao userDao() {
        	UserDao userDao= new UserDaoImpl();
			return userDao;
        }
    }
	
	@Autowired
	private UserDao userDao;

	@Test
	public void userAddTest() {
		User user= new User();
		user.setFirstName("Suchit");
		user.setLastName("Kumar");
		user.setEmail("suchit.kr7@gmail.com");
		user.setContactNumber("7029102936");
		user.setPassword("test");
		user.setRole("user");
		user.setEnabled(true);
		
	assertEquals("Failed to add User", true, userDao.addUser(user));
		
		/*Address address= new Address();
		address.setAddress1("ABC");
		address.setAddress2("XYZ");
		address.setCity("Bangalore");
		address.setCountry("India");
		address.setPinCode(828105);
		address.setState("Karnataka");
		address.setUser_id(1);
		address.setBilling(true);
		address.setShipping(true);*/
	}

}
