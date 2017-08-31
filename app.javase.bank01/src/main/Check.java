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
public class Check {
public static void che() throws Exception{
	double money=AccountCache.getInstance().getWrapData().getAccount().getBalance();
	System.out.println("当前余额为：\n"+money);
	System.out.println("..............请选择................");
	System.out.println("1.返回");
	System.out.println("2.退出");
	int c1=InputFactory.getInput(TYPE.INT).hashCode();
	if(c1==1){
		Menu.me();
		AccountCache.getInstance().getWrapData().getAccount().setBalance(money);
		
	}
	if(c1==2){
		System.out.println("....................再见.....................");
		System.exit(0);
	}
	}

}
