package JavaPackages;
import JavaPackages.Person;
public class Employee extends Person{
    private String employeeID;
    private double salary;
    private static int nextId = 1;

    public void setSalary(double salary){
       this.salary = salary;
    }
    private void setEmployeeID(){
        this.employeeID = Integer.toString(nextId++);
    }
    private void copyEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getEmployeeID(){
        if(this.employeeID != null)
            return this.employeeID;
        else 
            return null;
    }

    public Employee(String personName, String address, double salary){
        super(personName, address);
        this.setSalary(salary);
        this.setEmployeeID();
    }

    public Employee(Employee employee){
        super(employee.getPersonName(), employee.getAddress());
        this.setSalary(employee.getSalary());
        this.copyEmployeeID(employee.getEmployeeID());
    }

    @Override
    public void showPersonDetails(){
        System.out.println(this.getPersonName() + " with " + 
            this.getEmployeeID() + " ID has " + 
            Double.toString(this.getSalary()) + 
            " salary, lives on " + this.getAddress());
    }
}