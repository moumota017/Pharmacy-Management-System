package pharmacy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PharmacyController {

    @FXML private TextField medicineNameField;
    @FXML private TextField quantityField;
    @FXML private TextField priceField;

    @FXML private TableView<Medicine> medicineTable;
    @FXML private TableColumn<Medicine, String> nameColumn;
    @FXML private TableColumn<Medicine, Integer> quantityColumn;
    @FXML private TableColumn<Medicine, Double> priceColumn;

    private ObservableList<Medicine> medicineList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(data -> data.getValue().nameProperty());
        quantityColumn.setCellValueFactory(data -> data.getValue().quantityProperty().asObject());
        priceColumn.setCellValueFactory(data -> data.getValue().priceProperty().asObject());

        medicineTable.setItems(medicineList);
    }

    @FXML
    public void handleAddMedicine() {
        String name = medicineNameField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());

        medicineList.add(new Medicine(name, quantity, price));

        medicineNameField.clear();
        quantityField.clear();
        priceField.clear();
    }
}
