abstract class Employee {
//    using access modifiers to show the visibility of our variables
    private String name;
    private int id;

//    initialising our class contuctors
    public Employee(String name,int id){
        this.name=name;
        this.id =id;
    }
//      Using encapsulation and using getters and setters.
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
//    using abstract methods


    public abstract double calculateSalary();


    @Override
    public String toString(){
    return "Employee[name="+name+",id="+id +",salary=" +calculateSalary()+"]";
    }
}




public class Main {
        public static void main(String[] args) {
            PayRollSystem payRollSystem =new PayRollSystem();
            FullTimeEmployee emp1 = new FullTimeEmployee("Neel",007, 10000 );
            PartTimeEmployee emp2= new PartTimeEmployee("David",69,40,26);
            payRollSystem.addEmployee(emp1);
            payRollSystem.addEmployee(emp2);
            System.out.println("Intial employee details:");
            payRollSystem.displayEmployees();
            System.out.println("Removing Employees: ");
            payRollSystem.removeEmployee(69);
            System.out.println("Remaining employees details: ");
            payRollSystem.displayEmployees();
        }
    }
