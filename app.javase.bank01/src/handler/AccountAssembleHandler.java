package handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import model.Account;
import storage.scope.AccountCache;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//账户装配管理
public class AccountAssembleHandler {

	private Map<String, Account> accounts=new HashMap();
	

	public AccountAssembleHandler()  {
	
	}
	
	
	public Map<String, Account> loadAccounts() throws IOException {
		

			OutputStream out = new FileOutputStream("d:/英雄时刻/a.xls");
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
			HSSFCell row_title_cell4 = row_title.createCell(4);
			row_title_cell4.setCellValue("账户");
			HSSFCell row_title_cell5 = row_title.createCell(5);
			row_title_cell5.setCellValue("密码");
			HSSFCell row_title_cell6 = row_title.createCell(6);
			row_title_cell6.setCellValue("余额");
			
			HSSFRow row = sheet.createRow(1);
			HSSFCell cell = row.createCell(0);
			cell.setCellValue("白云");
			HSSFCell cell2 = row.createCell(1);
			cell2.setCellValue("女");
			HSSFCell cell3 = row.createCell(2);
			cell3.setCellValue("19960101");
			HSSFCell cell4 = row.createCell(3);
			cell4.setCellValue("614208");
			HSSFCell cell5 = row.createCell(4);
			cell5.setCellValue("123456");
			HSSFCell cell6 = row.createCell(5);
			cell6.setCellValue("666666");
			HSSFCell cell7 = row.createCell(6);
			cell7.setCellValue(800000.0);
			
			HSSFRow row2 = sheet.createRow(2);
			HSSFCell cell01 = row2.createCell(0);
			cell01.setCellValue("黑土");
			HSSFCell cell02 = row2.createCell(1);
			cell02.setCellValue("男");
			HSSFCell cell03 = row2.createCell(2);
			cell03.setCellValue("19950202");
			HSSFCell cell04 = row2.createCell(3);
			cell04.setCellValue("614211");
			HSSFCell cell05 = row2.createCell(4);
			cell05.setCellValue("456789");
			HSSFCell cell06 = row2.createCell(5);
			cell06.setCellValue("888888");
			HSSFCell cell07 = row2.createCell(6);
			cell07.setCellValue(60.0);
			
			wb.write(out);
			out.flush();
			out.close();
       

			InputStream in = new FileInputStream("d:/英雄时刻/a.xls");
			HSSFWorkbook wb1 = new HSSFWorkbook(in);
			HSSFSheet sheet1= wb1.getSheetAt(0);
			Iterator<Row> rows1 = sheet1.iterator();
			int r=0;
			while(rows1.hasNext()) {
				
				Row row1 = rows1.next();
				Iterator<Cell> cells =  row1.cellIterator();
				double  [ ] darray=new double [1];
                String [ ]strings=new String[7];
                int d=0;
    			int i=0;
				while(cells.hasNext()) {
					
					Cell cell1 = cells.next();
					
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						strings[i]=cell1.getStringCellValue();
						 i++;
						 System.out.print(cell1.getStringCellValue()+"\t\t");
						 
						break;
					case Cell.CELL_TYPE_NUMERIC:
						darray[0]= cell1.getNumericCellValue();
						d++;
						System.out.print(cell1.getNumericCellValue()+"\t\t");
						
						break;

					default:
						break;
					}
					
			}	
				
				for (String s : strings) {
//					System.out.print(s);
				}
				
				
				if(r>0){
					if(strings[6]==null){
						Account acconut=new Account(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],darray[0]);		
//						System.out.println(acconut);
						accounts.put(strings[4], acconut );	

					}else{
						Account acconut=new Account(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],Double.parseDouble(strings[6]));
//						System.out.println(acconut);
						accounts.put(strings[4], acconut );	
					}
					
				
				}
				System.out.println();
			r++;	
			}
				
			
				
				System.out.println();
		
		return accounts;
	}

}
