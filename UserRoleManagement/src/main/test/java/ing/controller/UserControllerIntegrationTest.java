package main.test.java.ing.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import main.java.Application;
import main.java.ing.model.User;

@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerIntegrationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetUserList() throws URISyntaxException {
		final String baseUrl = "http://localhost:" + port + "/userList";
		URI getUserList = new URI(baseUrl);
		ResponseEntity<ArrayList> result = this.restTemplate.getForEntity(getUserList, ArrayList.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void testAddUser() throws URISyntaxException {
		final String baseUrl = "http://localhost:" + port + "/addUserData";
		URI addUserData = new URI(baseUrl);
		User user = new User(1, "Rameshwar", "Emp", "Admin");
		List<User> users = new ArrayList<User>();
		users.add(user);
		ResponseEntity result = this.restTemplate.postForEntity(addUserData, users, Object.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void testgetUserRole() throws URISyntaxException {
		Integer id = new Integer(1);
		final String baseUrl = "http://localhost:" + port + "/user?id=1";
		URI user = new URI(baseUrl);
		ResponseEntity<User> result = this.restTemplate.getForEntity(user, User.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals(true, result.getBody().getId() == 1);

	}

}
