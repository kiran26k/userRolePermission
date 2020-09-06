package main.java.ing.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.ing.model.User;
import main.java.service.UserService;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	@Qualifier("userService")
	UserService userService;

	@GetMapping("/userList")
	public List<User> getUserData() {
		String filename = "user.csv";
		LOGGER.debug("getUserData : read data from CSV");
		return userService.readUsers(filename);
	}

	@PostMapping("/addUserData")
	public void writeUserRolesToCSV(@RequestBody List<User> users) {
		LOGGER.debug("writeUserRolesToCSV : user data added to file");
		userService.loadUsersToCSV(users);
	}
	
	@GetMapping("/user")
	public User getUserByID(@RequestParam(value = "id") int id) {
		LOGGER.debug("getUserData");
		return userService.getUserById(id);
	}

}
