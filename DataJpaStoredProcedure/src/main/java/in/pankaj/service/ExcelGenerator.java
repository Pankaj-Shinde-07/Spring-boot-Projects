package in.pankaj.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import in.pankaj.entity.Employee;

public class ExcelGenerator {
	
	public static void generateExcel(List<Employee> employees) throws IOException {

	    XSSFWorkbook workbook = new XSSFWorkbook();

	    XSSFSheet sheet = workbook.createSheet("Employees");//passing sheet name

	    Row header = sheet.createRow(0);

	    header.createCell(0).setCellValue("ID");
	    header.createCell(1).setCellValue("Name");
	    header.createCell(2).setCellValue("Salary");

	    int rowNum = 1;

	    for(Employee emp : employees) {

	        Row row = sheet.createRow(rowNum++);

	        row.createCell(0).setCellValue(emp.getId());
	        row.createCell(1).setCellValue(emp.getName());
	        row.createCell(2).setCellValue(emp.getSalary());
	    }

	    FileOutputStream fos = new FileOutputStream("employees.xlsx");

	    workbook.write(fos);

	    fos.close();
	    workbook.close();
	}
}
