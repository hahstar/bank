package service;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import handler.AccountAssembleHandler;
import model.Account;
import model.WrapData;
import storage.scope.AccountCache;
//账户装配服务
public class AccountAssembleService {
	
	//调用 handler 层 进行装配
	private AccountAssembleHandler handler = new AccountAssembleHandler();
	
	//用来暂存  所有的账户们
	private Map<String , Account> accounts ;
    
	//
	public void loadAccounts() throws IOException {
		
		//加载账户信息
		accounts = handler.loadAccounts();
		Set keys=accounts.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			Object key=it.next();
//			System.out.println(accounts.get(key));
		}
//		System.out.println(accounts);
		WrapData wrapData = new WrapData();
		wrapData.setAccounts(accounts);
		
		AccountCache.getInstance().setWrapData(wrapData);
	}

}
