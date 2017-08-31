package main;
import service.AccountService;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import dispatcher.MainDispatch;
import model.Account;
import model.sys.Menu;
import service.AccountAssembleService;
import utils.Biz;
import utils.InputFactory;
import utils.InputFactory.TYPE;

public class Change {
	

public static void cha() throws Exception {
	
		
	System.out.println("..............修改信息................\n");
	
	System.out.println("请修改姓名：");
		String e=InputFactory.getInput(TYPE.STRING).toString();
	System.out.println("请修改性别：");
		String f=InputFactory.getInput(TYPE.STRING).toString();
	System.out.println("请修改生日：");
		String g=InputFactory.getInput(TYPE.STRING).toString();
	System.out.println("请修改电话：");
		String h=InputFactory.getInput(TYPE.STRING).toString();
		
	System.out.println("当前信息：");
	System.out.println("姓名："+e+"\n性别："+f+"\n生日："+g+"\n电话："+h);
	System.out.println("..............修改信息成功................\n");
	
		OutputStream out = new FileOutputStream("d:/英雄时刻/b.xls");
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("User_Data");
		
		HSSFRow row_title = sheet.createRow(0);
		HSSFCell row_title_cell0 = row_title.createCell(0);
		row_title_cell0.setCellValue("姓名");
		HSSFCell row_title_cell1 = row_title.createCell(1);
		row_title_cell1.setCellValue("性别");
		HSSFCell row_title_cell2 = row_title.createCell(2);
		row_title_cell2.setCellValue("生日");
		HSSFCell row_title_cell3 = row_title.createCell(3);
		row_title_cell3.setCellValue("电话");
		
		HSSFRow row = sheet.createRow(1);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue(e);
		HSSFCell cell2 = row.createCell(1);
		cell2.setCellValue(f);
		HSSFCell cell3 = row.createCell(2);
		cell3.setCellValue(g);
		HSSFCell cell4 = row.createCell(3);
		cell4.setCellValue(h);
				 
		HSSFRow row2 = sheet.createRow(2);
		HSSFCell cell01 = row2.createCell(0);
		cell01.setCellValue("黑土");
		HSSFCell cell02 = row2.createCell(1);
		cell02.setCellValue("男");
		HSSFCell cell03 = row2.createCell(2);
		cell03.setCellValue("19950202");
		HSSFCell cell04 = row2.createCell(3);
		cell04.setCellValue("614211");
		
		wb.write(out); 
		out.flush();
		out.close();
   	
	System.out.println("请输入：");
	System.out.println("1.重新修改");
	System.out.println("2.继续");
	int c1=InputFactory.getInput(TYPE.INT).hashCode();
	if(c1==1){
		Change.cha();
		
	}
	if(c1==2){
		
	
	System.out.println("..............请选择................\n");
	System.out.println("1.返回");
	System.out.println("2.退出");
	int c2=InputFactory.getInput(TYPE.INT).hashCode();
	if(c2==1){
		
		Menu.me();
	}
	if(c2==2){
		System.out.println("....................再见.....................");
		System.exit(0);
	}
	}

}
}
