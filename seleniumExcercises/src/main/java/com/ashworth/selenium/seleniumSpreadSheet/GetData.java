package com.ashworth.selenium.seleniumSpreadSheet;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {



	public static int returnAllValues() throws InvalidFormatException, IOException {
		//ArrayList<String>
        Workbook workbook = WorkbookFactory.create(new File(Constants.TESTDATALOCATION+Constants.TESTDATAFILE));

        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        ArrayList<String> excelValues = new ArrayList<String>();
        int i = 0;
        for (Row row: sheet) {
        	i++;
            for(Cell cell: row) {
                excelValues.add(dataFormatter.formatCellValue(cell));
            }
        }
        workbook.close();
        
        return i;
	}
	
}