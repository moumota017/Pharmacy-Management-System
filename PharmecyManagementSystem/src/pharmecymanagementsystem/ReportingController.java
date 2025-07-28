package pharmecymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReportingController {
    @FXML private DatePicker dpStart, dpEnd;
    @FXML private Button btnSalesReport, btnInventoryReport, btnRxHistory;
    @FXML private TextArea taReport;

    @FXML private void generateSalesReport() {
        // TODO: query DB, append to taReport
    }

    @FXML private void generateInventoryReport() {
        // TODO: show low stock, reorder list
    }

    @FXML private void generateRxHistoryReport() {
        // TODO: fetch by patient/date range
    }
}

