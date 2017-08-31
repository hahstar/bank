package handler;

import java.util.Map;

import model.Account;
import storage.scope.AccountCache;
//账户管理
public class AccountHandler {

	private Map<String, Account> accounts;

	//校验登录
	public Account checkAccount(Account account) {

		accounts = AccountCache.getInstance().getWrapData().getAccounts();
		System.out.println(accounts.size());

		if (accounts.containsKey(account.getCard())) {

			Account eq = accounts.get(account.getCard()); //帐号对上了 , 下一步查密码

			if (account.getPwd().equals(eq.getPwd())) {
				return eq;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
