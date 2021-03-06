package service;

import model.sys.Menu;

import dispatcher.MainDispatch;
import handler.AccountHandler;
import model.Account;
import model.WrapData;
import storage.scope.AccountCache;
import utils.Biz;
import utils.InputFactory;
import utils.InputFactory.TYPE;
//账户服务
public class AccountService {
	
	private AccountHandler accountHandler = new AccountHandler();
	
	int count = 0; //计数器 3
	
	public void doLogin() throws Exception {
		Account temp = new Account();
		System.out.println("\n请输入账户: ");
		temp.setCard(InputFactory.getInput(TYPE.STRING).toString());
		System.out.println("请输入密码 : ");
		temp.setPwd(InputFactory.getInput(TYPE.STRING).toString());
//		int re=(int)( Math.random()*10000);
//		System.out.println("请输入验证码:"+re);
//		temp.setRan(InputFactory.getInput(TYPE.STRING).toString());
		temp = accountHandler.checkAccount(temp);   // 此时的 temp 已经是库里的 某位用户的全部信息了
		
		if(temp!=null) { //如果登录成功
			//将登录成功的用户  保存进缓存.
			AccountCache.getInstance().getWrapData().setAccount(temp);
	        MainDispatch.dispatch(Biz.MAIN);
	        
			
		}else {
			if(count<2) {
				System.err.println("第 "+ ++count +" 次登录失败 , 请重新登录");
				doLogin();
			} else {
				System.err.println("...........................系统退出，再见..............................");
				System.exit(0);
			}
		}
	}
	

}
