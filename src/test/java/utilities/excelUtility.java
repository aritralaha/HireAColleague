package utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelUtility {

    public  FileInputStream file;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFCell cell;


    public int getTotalRows(String path,String sheetName) throws IOException {
        file =new FileInputStream(path);
        workbook=new XSSFWorkbook(file);
        sheet= workbook.getSheet(sheetName);
        int getTotalRow = sheet.getLastRowNum();
        workbook.close();
        file.close();
        return getTotalRow;
        }

     public int getTotalColumns(String path, String sheetName, int row) throws IOException {
        file=new FileInputStream(path);
        workbook=new XSSFWorkbook(file);
        sheet= workbook.getSheet(sheetName);
        int getTotalCols = sheet.getRow(row).getLastCellNum();
        workbook.close();
        file.close();
        return  getTotalCols;
     }

    public String getCellValue(String path,String sheetName,int row, int col) throws IOException {
        file=new FileInputStream(path);
        workbook=new XSSFWorkbook(file);
        sheet= workbook.getSheet(sheetName);
        cell = sheet.getRow(row).getCell(col);
        String cellValue = cell.toString();
        workbook.close();
        file.close();
        return cellValue;
    }
}
