package dispatcher;

import service.AccountService;
import utils.Biz;
import model.sys.Menu;
//中央调度
public class MainDispatch {

	private static AccountService accountService = new AccountService();

	public static void dispatch(String forward) throws Exception {

		switch (forward) {

		case Biz.LOGIN:

			accountService.doLogin();

			break;
			
		case Biz.MAIN:

			System.out.println("...........................登陆成功..........................\n请选择服务：\n");
			
			Menu.me();
            
			break;

		default:
			break;
		}

	}

}
