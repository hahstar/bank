package main;
import java.util.Scanner;

import org.junit.Test;
import handler.AccountAssembleHandler;
import dispatcher.MainDispatch;
import model.sys.Menu;
import service.AccountAssembleService;
import storage.scope.AccountCache;
import model.Account;
import utils.Biz;
import utils.InputFactory;
import utils.InputFactory.TYPE;
public class Bring {
	
public static void bri() throws Exception{
	
	    double money=AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("..............取款................\n");
		System.out.println("当前余额为：\n"+money);
		System.out.println("请输入要取出数目：");
		int b1=InputFactory.getInput(TYPE.INT).hashCode();
		System.out.println("（哗哗哗）数钱声.......");
		double mo=money-b1;
		AccountCache.getInstance().getWrapData().getAccount().setBalance(mo);
		System.out.println("当前余额为："+AccountCache.getInstance().getWrapData().getAccount().getBalance());
		System.out.println("..............请选择................\n");
		System.out.println("1.返回");
		System.out.println("2.退出");
		int b2=InputFactory.getInput(TYPE.INT).hashCode();
		if(b2==1){
			Menu.me();
			AccountCache.getInstance().getWrapData().getAccount().setBalance(money-=b1);
		}
		if(b2==2){
			System.out.println("....................再见.....................");
			System.exit(0);
		}
	
}
}
