package LangPackage;

public class Employee11 {
	
	String name;
	int id;
	String username;
	

	Employee11(String name, int id, String username) {
		this.name = name;
		this.id = id;
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	@Override
	public int hashCode() {
		int code = 0;
		code = id*20;
		code += name.hashCode();
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee11) {
			Employee11 e = (Employee11)obj;
			return (this.username.equals(e.username));
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", username=" + username + "]";
	}
	
	

}
