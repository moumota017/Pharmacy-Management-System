package pharmacy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InventoryController {
    @FXML private TextField nameField, quantityField, priceField, supplierField, stockChangeField;
    @FXML private ChoiceBox<String> stockActionBox;
    @FXML private TableView<Medicine> medicineTable;
    @FXML private TableColumn<Medicine, String> nameColumn, supplierColumn;
    @FXML private TableColumn<Medicine, Integer> quantityColumn;
    @FXML private TableColumn<Medicine, Double> priceColumn;

    private final ObservableList<Medicine> medicineList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(data -> data.getValue().nameProperty());
        quantityColumn.setCellValueFactory(data -> data.getValue().quantityProperty().asObject());
        priceColumn.setCellValueFactory(data -> data.getValue().priceProperty().asObject());
        supplierColumn.setCellValueFactory(data -> data.getValue().supplierProperty());

        medicineTable.setItems(medicineList);
        stockActionBox.setItems(FXCollections.observableArrayList("Add Stock", "Remove Stock"));
        stockActionBox.setValue("Add Stock");
    }

    @FXML
    public void addOrUpdateProduct() {
        String name = nameField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());
        String supplier = supplierField.getText();

        for (Medicine m : medicineList) {
            if (m.getName().equalsIgnoreCase(name)) {
                m.setQuantity(quantity);
                m.setPrice(price);
                m.setSupplier(supplier);
                medicineTable.refresh();
                clearFields();
                return;
            }
        }

        medicineList.add(new Medicine(name, quantity, price));
        clearFields();
    }

    @FXML
    public void deleteProduct() {
        Medicine selected = medicineTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            medicineList.remove(selected);
        }
    }

    @FXML
    public void updateStock() {
        Medicine selected = medicineTable.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        int change = Integer.parseInt(stockChangeField.getText());
        if (stockActionBox.getValue().equals("Remove Stock")) {
            change = -change;
        }

        int newQty = selected.getQuantity() + change;
        if (newQty < 0) newQty = 0;
        selected.setQuantity(newQty);
        medicineTable.refresh();
        stockChangeField.clear();
    }

    @FXML
    public void generatePO() {
        StringBuilder po = new StringBuilder("Purchase Order:\n------------------\n");
        for (Medicine m : medicineList) {
            if (m.getQuantity() < 10) {
                po.append(String.format("Order %s from %s (Current: %d)\n", m.getName(), m.getSupplier(), m.getQuantity()));
            }
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION, po.toString(), ButtonType.OK);
        alert.setTitle("Purchase Order");
        alert.setHeaderText("Generated Purchase Order");
        alert.show();
    }

    private void clearFields() {
        nameField.clear();
        quantityField.clear();
        priceField.clear();
        supplierField.clear();
    }
}
