package model;
//账户
public class Account {

	private String sex;
	private String card;
	private String ran;
	private String pwd;
	private double balance;

	private String name;
	private String tel;
	private String birth;
	public Account(){
		
	}

	public Account(String name,String sex,String birth,String tel,String card,String pwd,double balance) {
		super();
		this.card = card;
		this.pwd = pwd;
		this.birth=birth;
		this.name=name;
		this.tel=tel;
		this.balance=balance;
		this.sex=sex;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Cus [name=");
		builder.append(name);
		builder.append(", card=");
		builder.append(card);
		builder.append(", pwd=");
		builder.append(pwd);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", tel=");
		builder.append(tel);
		builder.append(", birth=");
		builder.append(birth);
		builder.append("]");
		return builder.toString();
		
		
	}
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getPwd() {

		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRan() {
		return ran;
	}

	public void setRan(String ran) {
		this.ran = ran;
	}
	

}
