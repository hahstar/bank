package main;
import java.util.Scanner;

import org.junit.Test;


import dispatcher.MainDispatch;
import model.sys.Menu;
import service.AccountAssembleService;
import storage.scope.AccountCache;
import utils.Biz;
import utils.InputFactory;
import utils.InputFactory.TYPE;
public class Transfer {
	public static void tran() throws Exception{
		double money=AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("..............转账................");
		System.out.println("当前余额为：\n"+money);
		System.out.println("请输入要转入的账户：");
		String t1=InputFactory.getInput(TYPE.STRING).toString();
		System.out.println("请输入要转入的数目：");
		int t2=InputFactory.getInput(TYPE.INT).hashCode();
		double mo=money-t2;
		AccountCache.getInstance().getWrapData().getAccount().setBalance(mo);
		System.out.println("当前余额为："+AccountCache.getInstance().getWrapData().getAccount().getBalance());
		System.out.println("..............请选择................");
		System.out.println("1.返回");
		System.out.println("2.退出");
		int t3=InputFactory.getInput(TYPE.INT).hashCode();
		if(t3==1){
			Menu.me();
			AccountCache.getInstance().getWrapData().getAccount().setBalance(money-=t2);
		}
		if(t3==2){
			System.out.println("....................再见.....................");
			System.exit(0);
		}

	}

}
