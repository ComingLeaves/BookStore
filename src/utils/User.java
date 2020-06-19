package utils;

public class User {

	private int uid;
	private String username;
	private String password;
	private String gender;
	private String telephone;
	private String address;
	private String birthday;
	private String authority;
	
	public User(String username, String password, String gender,
			String telephone, String address, String birthday, String authority) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.telephone = telephone;
		this.address = address;
		this.birthday = birthday;
		this.authority = authority;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", gender=" + gender
				+ ", telephone=" + telephone + ", address=" + address + "]";
	}
	
	
}
