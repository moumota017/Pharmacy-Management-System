package pharmacy;

import javafx.beans.property.*;

public class Medicine {
    private final StringProperty name;
    private final IntegerProperty quantity;
    private final DoubleProperty price;

    public Medicine(String name, int quantity, double price) {
        this.name = new SimpleStringProperty(name);
        this.quantity = new SimpleIntegerProperty(quantity);
        this.price = new SimpleDoubleProperty(price);
    }

    public StringProperty nameProperty() { return name; }
    public IntegerProperty quantityProperty() { return quantity; }
    public DoubleProperty priceProperty() { return price; }
}
