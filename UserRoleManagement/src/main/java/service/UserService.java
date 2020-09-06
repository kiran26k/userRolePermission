package main.java.service;

import java.util.List;

import main.java.ing.model.User;

public interface UserService {

	public List<User> readUsers(String name);

	public void loadUsersToCSV(List<User> users);

	public User getUserById(int id);
}
