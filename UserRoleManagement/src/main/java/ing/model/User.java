package main.java.ing.model;

public class User {

	private int id;
	private String name;
	private String designation;
	private String permission;

	public User(int id, String name, String designation, String permission) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.permission = permission;
	}

	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", designation=" + designation + ", permission=" + permission
				+ "]";
	}

}
