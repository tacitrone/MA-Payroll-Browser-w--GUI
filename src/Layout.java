import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;

public class Layout {
    
    
    @FXML private TabPane tabPane;
    
    // controls for the "Search by Job Title" tab
    @FXML private Button JobSearchButton;
    @FXML private TextField JobEntryText;
    @FXML private Label JobTitle_Median;
    @FXML private Label JobTitle_Average;
    @FXML private TableView JobTitle_TopEarners;
    @FXML private TableView JobTitle_BottomEarners;
    @FXML private TableColumn JobTitle_TopEarners_NameColumn;
    @FXML private TableColumn JobTitle_TopEarners_SalaryColumn;
    @FXML private TableColumn JobTitle_BottomEarners_NameColumn;
    @FXML private TableColumn JobTitle_BottomEarners_SalaryColumn;
    
    // controls for the "Search by Employee" tab
    @FXML private Button EmployeeSearchButton;
    @FXML private TextField EmployeeEntryText;
    @FXML private Label Employee_Median;
    @FXML private Label Employee_Average;
    @FXML private TableView Employee_TopEarners;
    @FXML private TableView Employee_BottomEarners;
    @FXML private TableColumn Employee_TopEarners_NameColumn;
    @FXML private TableColumn Employee_TopEarners_SalaryColumn;
    @FXML private TableColumn Employee_BottomEarners_NameColumn;
    @FXML private TableColumn Employee_BottomEarners_SalaryColumn;
    
    // controls for the "Search by Department" tab
    @FXML private Button DepartmentSearchButton;
    @FXML private TextField DepartmentEntryText;
    @FXML private Label Department_Median;
    @FXML private Label Department_Average;
    @FXML private TableView Department_TopEarners;
    @FXML private TableView Department_BottomEarners;
    @FXML private TableColumn Department_TopEarners_NameColumn;
    @FXML private TableColumn Department_TopEarners_SalaryColumn;
    @FXML private TableColumn Department_BottomEarners_NameColumn;
    @FXML private TableColumn Department_BottomEarners_SalaryColumn;
    
    // event handlers for the controls
    @FXML private void handleJobSearchButton() {
        // TODO: implement this method
    }
    
    @FXML private void handleEmployeeSearchButton() {
        // TODO: implement this method
    }
    
    @FXML private void handleDepartmentSearchButton() {
        // TODO: implement this method
    }
}