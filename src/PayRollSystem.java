import java.util.ArrayList;
import java.util.Arrays;

public class PayRollSystem {
    private ArrayList<Employee> employeelist;

    public PayRollSystem(){
        employeelist= new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove =null;
        for(Employee employee: employeelist){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null){
            employeelist.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for(Employee employee:employeelist){
            System.out.println(employee);
        }
    }
}
