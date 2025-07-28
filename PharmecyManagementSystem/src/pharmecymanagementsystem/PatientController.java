package pharmecymanagementsystem;

import pharmecymanagementsystem.Patient;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PatientController {
    @FXML private TableView<Patient> tblPatients;
    @FXML private TextField tfName, tfAddress, tfPhone;
    @FXML private DatePicker dpDOB;
    @FXML private Button btnRegister, btnUpdate, btnHistory;

    @FXML public void initialize() {
        // init table columns, load patients
    }

    @FXML private void registerPatient() {
        // TODO: insert Patient into DB
    }

    @FXML private void updatePatient() {
        // TODO: update DB
    }

    @FXML private void viewHistory() {
        // TODO: show past prescriptions
    }
}

