package main.java.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import main.java.ing.model.User;
import main.java.ing.utility.CSVUtility;
import main.java.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	public String checkRole() {
		return null;
	}

	public List<User> readUsers(String name) {
		List<User> users = new ArrayList<User>();
		CSVParser csvReader = CSVUtility.read(name);
		for (CSVRecord csvRecord : csvReader) {
			User user = new User();
			user.setId(Integer.parseInt(csvRecord.get("Id")));
			user.setName(csvRecord.get("Name"));
			user.setDesignation(csvRecord.get("Designation"));
			user.setPermission(csvRecord.get("Permission"));
			users.add(user);
		}
		return users;
	}

	public void loadUsersToCSV(List<User> users) {
		CSVPrinter csvPrinter = CSVUtility.write();
		try {
			for (User user : users) {
				csvPrinter.printRecord(
						Arrays.asList(user.getId(), user.getName(), user.getDesignation(), user.getPermission()));
				LOGGER.info("User Added" + user.toString());
			}
			csvPrinter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public User getUserById(int id) {
		String filename = "user.csv";
		List<User> userData = readUsers(filename);
		return userData.stream().filter(user -> user.getId() == id).findFirst().get();
	}

	/// role check

}
