package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/15
 **/
public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Cities.xlsx";

        try {
            OutputStream fileWriter = new FileOutputStream(filePath);
            //create a workbook object
            XSSFWorkbook workbook = new XSSFWorkbook();
            //create a spreadsheet inside the workbook
            XSSFSheet sheet = workbook.createSheet("Cities");
            //create header row
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("City");
            header.createCell(1).setCellValue("Population");
            //create row 1
            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Centurion");
            row1.createCell(1).setCellValue(500000);
            //create row 2
            XSSFRow row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("Midrand");
            row2.createCell(1).setCellValue(150000);

            workbook.write(fileWriter);
            fileWriter.close();
            workbook.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
