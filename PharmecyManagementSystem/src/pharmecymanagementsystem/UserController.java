package pharmecymanagementsystem;

import pharmecymanagementsystem.Role;
import pharmecymanagementsystem.User;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UserController {
    @FXML private TableView<User> tblUsers;
    @FXML private TextField tfUsername;
    @FXML private PasswordField pfPassword;
    @FXML private ComboBox<Role> cbRoles;
    @FXML private Button btnAddUser, btnDeleteUser, btnAssignRole;

    @FXML public void initialize() {
        // load users and roles
    }

    @FXML private void addUser() {
        // TODO: hash password, insert into DB
    }

    @FXML private void deleteUser() {
        // TODO: remove user
    }

    @FXML private void assignRole() {
        // TODO: update user.role in DB
    }
}

