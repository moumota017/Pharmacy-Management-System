package pharmecymanagementsystem;

import java.time.LocalDate;
import java.util.List;

public class Patient {
    private int id;
    private String name;
    private String address;
    private String phone;
    private LocalDate dob;
    private List<Prescription> history;
    // getters/setters
}

