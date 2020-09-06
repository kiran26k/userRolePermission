package main.java.ing.model;

public class Role {

	private int roleId;
	private String role;
	private String rolePermission;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRolePermission() {
		return rolePermission;
	}

	public void setRolePermission(String rolePermission) {
		this.rolePermission = rolePermission;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", role=" + role + ", rolePermission=" + rolePermission + "]";
	}

}
