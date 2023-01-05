package murat.utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtils {
    private Workbook workbook;

    private Sheet sheet;

    private String path;

    public ExcelUtils(String path,int sheetIndex) throws FileNotFoundException {
        this.path =path;

        try {
            FileInputStream fis = new FileInputStream(path);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheetAt(sheetIndex);
        }
        catch (Exception e) {

        }

    }

}
