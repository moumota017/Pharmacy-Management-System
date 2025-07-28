package pharmecymanagementsystem;

public class Product {
    private int id;
    private String name;
    private int stock;
    private int reorderPoint;
    private double price;
    private Supplier supplier;

    // getters/setters

    public boolean isLowStock() {
        return stock <= reorderPoint;
    }

    void nameProperty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object stockProperty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getStock() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

