package pharmecymanagementsystem;

import java.time.LocalDateTime;
import java.util.List;

public class Sale {
    private int id;
    private List<Prescription> prescriptions;
    private double total;
    private String paymentMethod;
    private double discount;
    private LocalDateTime timestamp;
    // getters/setters
}

