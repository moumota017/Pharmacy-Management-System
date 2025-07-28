package pharmecymanagementsystem;

import pharmecymanagementsystem.Prescription;
import pharmecymanagementsystem.Sale;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SalesController {
    @FXML private TableView<Prescription> tblPrescription;
    @FXML private Button btnAddRx, btnCheckInteraction, btnProcessSale;
    @FXML private ComboBox<String> cbPayment;
    @FXML private TextField tfDiscount;

    @FXML public void initialize() {
        // setup table, load OTC items
    }

    @FXML private void addPrescription() {
        // TODO: add new Rx to table
    }

    @FXML private void checkInteraction() {
        // TODO: loop prescriptions, flag interactions
    }

    @FXML private void processSale() {
        Sale sale = new Sale();
        // TODO: compute total, apply discount, save to DB
    }
}

