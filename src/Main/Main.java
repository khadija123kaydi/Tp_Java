package Main;
import Model.*;
import View.EmployeesView;
import DAO.*;
import Controller.*;
public class Main {
	public static void main(String[] args) {
		EmployeeDAOimplement dao = new EmployeeDAOimplement();
		EmployeeModel model = new EmployeeModel(dao);
		EmployeesView view = new EmployeesView();
		EmployeeController controller = new EmployeeController(view,model);
	}
}
