package com.cts.hibernate.xlSql.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.cts.hibernate.xlSql.Repo.SavedataToDb;
import com.cts.hibernate.xlSql.pojo.Datapojo;

public class ReadService {

	SavedataToDb repo;
	public List<Datapojo> ReadDataFromExcel(String excelPath) throws EncryptedDocumentException, InvalidFormatException, IOException{
	   
		   Workbook workbook = WorkbookFactory.create(new File(excelPath));
		   System.out.println("Workbook has"+workbook.getNumberOfSheets()+"Sheets : ");
		   System.out.println("Retriveing sheets uding for-each loop");
		   for (Sheet sheet : workbook) {
			
			   System.out.println("=>" + sheet.getSheetName());
			   
			   DataFormatter dataFromatterDataFormatter = new DataFormatter();
			   
			   for (Row row: sheet) {
				 
				   String series_ref = row.getCell(0).getStringCellValue();
				   String period = row.getCell(1).getStringCellValue();
				   double Data_value = row.getCell(2).getNumericCellValue();
				   String status = row.getCell(3).getStringCellValue();
				   String units = row.getCell(4).getStringCellValue();
				   double magnitude = row.getCell(5).getNumericCellValue();
				   String subject = row.getCell(6).getStringCellValue();
				   String group = row.getCell(7).getStringCellValue();
				   String seriest1 = row.getCell(8).getStringCellValue();
				   String seriest2 = row.getCell(9).getStringCellValue();
				   String seriest3 = row.getCell(10).getStringCellValue();
				   
				   
				   Datapojo dp = new Datapojo();
				     dp.setSeries_reference(series_ref);
				     dp.setPeriod(period);
				     dp.setData_value(Data_value);
				     dp.setStatus(status);
				     dp.setUnits(units);
				     dp.setMagnitude(magnitude);
				     dp.setSubject(subject);
				     dp.setGroup(group);
				     dp.setSeriest1(seriest1);
				     dp.setSeriest2(seriest2);
				     dp.setSeriest3(seriest3);
				     
				     repo.save(dp);
				        System.out.println(row.getCell(0));
		                System.out.println(row.getCell(1));
		                System.out.println(row.getCell(2));
		                System.out.println(row.getCell(3));
		                System.out.println(row.getCell(4));
		                System.out.println(row.getCell(5));
				     
				   
			}
			   
		}
		   
		return null;
	}
}
