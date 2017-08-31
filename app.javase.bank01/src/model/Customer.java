package model;

public class Customer {
//客户
	private String name;
	private String tel;
	private String birth;

	public Customer(String name,String tel,String birth) {
		this.name = name;
		this.birth=birth;
		this.tel=tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return birth;
		
	}
	
}
