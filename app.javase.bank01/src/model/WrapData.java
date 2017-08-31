package model;

import java.util.Map;
//包装数据
public class WrapData {

	private Account account;
	private Map<String, Account> accounts;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Map<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "WrapData [account=" + account + ", accounts=" + accounts + "]";
	}


}
