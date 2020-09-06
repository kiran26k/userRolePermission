package main.test.java.ing.serviceimpl;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import main.java.serviceimpl.UserServiceImpl;

public class UserServiceImplTest {
	
	
	@Mock
	UserServiceImpl userRoleService;
	
	
	@Test
	public void testReadUsers() {
		String userNm= "kiran";
		userRoleService.readUsers(userNm);
	}
	
	@Test
	public void testLoadUsersToCSV() {
		
	}
	
	@Test
	public void testGetUserById() {
		
	}

}
