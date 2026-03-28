import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.util.*;

public class ExcelReader {

    public static List<Integer> getJobIds() {
        List<Integer> ids = new ArrayList<>();

        try {
            File file = new File("data/option2_job_links.xlsx");
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                Cell idCell = row.getCell(0);

                if (idCell != null && idCell.getCellType() == CellType.NUMERIC) {
                    ids.add((int) idCell.getNumericCellValue());
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return ids;
    }
}