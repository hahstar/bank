package model.sys;
import model.Account;
import main.Bring;
import main.Change;
import main.Check;
import main.Loan;
import main.Save;
import main.Start;
import main.Transfer;
import utils.InputFactory;
import utils.InputFactory.TYPE;

public class Menu {
	public static void me() throws Exception{
		System.out.println("1.查询余额\n2.取款\n3.存款\n4.转账\n5.贷款\n6.修改信息\n9.注销\n0.退出\n");
		int ch=InputFactory.getInput(TYPE.INT).hashCode();
		
		if(ch==1){
			Check.che();
		}
		if(ch==2){
			Bring.bri();
		}
		if(ch==3){
			Save.sa();
		}
		if(ch==4){
			Transfer.tran();
		}
		if(ch==5){
			
			Loan.lo();
		}
		if(ch==6){
			Change.cha();
		}
		if(ch==9){
			
		}
		if(ch==0){
			System.out.println("...........................系统退出，再见..............................");
			System.exit(0);
		}
	}

}
