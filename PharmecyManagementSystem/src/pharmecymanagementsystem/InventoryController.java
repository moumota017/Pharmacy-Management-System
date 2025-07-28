package pharmecymanagementsystem;

import javafx.beans.property.SimpleStringProperty;
import pharmecymanagementsystem.Product;
import pharmecymanagementsystem.Supplier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InventoryController {
    @FXML private TableView<Product> productTable;
    @FXML private TableColumn<Product, String> colName, colStock;
    @FXML private TextField tfName, tfStock, tfReorder, tfPrice, tfSupplier;
    @FXML private Button btnAdd, btnEdit, btnDelete, btnReorder, btnPO;

    private ObservableList<Product> products = FXCollections.observableArrayList();

    @FXML public void initialize() {
        colName.setCellValueFactory(data -> {
            data.getValue().nameProperty();
            return null;
        });
       colStock.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getStock().toString()));
        productTable.setItems(products);
        loadProducts();
    }

    private void loadProducts() {
        // TODO: fetch from DB, add to products list
    }

    @FXML private void addProduct() {
        // TODO: validate inputs, insert into DB
        Product p = new Product();
        // set fields...
        products.add(p);
    }

    @FXML private void editProduct() {
        // TODO: update selected product
    }

    @FXML private void deleteProduct() {
        // TODO: delete from DB and list
    }

    @FXML private void generatePO() {
        // TODO: for low stock items, create purchase order
    }
}
