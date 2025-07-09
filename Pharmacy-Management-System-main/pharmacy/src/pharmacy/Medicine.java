package pharmacy;

import javafx.beans.property.*;

public class Medicine {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty quantity = new SimpleIntegerProperty();
    private final DoubleProperty price = new SimpleDoubleProperty();
    private final StringProperty supplier = new SimpleStringProperty();

    public Medicine(String name, int quantity, double price) {
        this.name.set(name);
        this.quantity.set(quantity);
        this.price.set(price);
       // this.supplier.set(supplier);
    }

    public String getName() { return name.get(); }
    public int getQuantity() { return quantity.get(); }
    public double getPrice() { return price.get(); }
    public String getSupplier() { return supplier.get(); }

    public void setQuantity(int qty) { this.quantity.set(qty); }
    public void setPrice(double p) { this.price.set(p); }
    public void setSupplier(String s) { this.supplier.set(s); }

    public StringProperty nameProperty() { return name; }
    public IntegerProperty quantityProperty() { return quantity; }
    public DoubleProperty priceProperty() { return price; }
    public StringProperty supplierProperty() { return supplier; }
}