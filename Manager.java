package JavaPackages;

import JavaPackages.Employee;
public class Manager extends Employee{
    private int departmentID;

    public void setDepartmentID(int departmentID){
        this.departmentID = departmentID;
    }
    public int getDepartmentID(){
        return this.departmentID;
    }

    public Manager(String personName, String address, double salary, int departmentID){
        super(personName, address, salary);
        this.setDepartmentID(departmentID);
    }

    public Manager(Manager manager){
        super((Employee) manager);
        this.setDepartmentID(manager.getDepartmentID());
    }

    @Override
    public void showPersonDetails(){
        System.out.println("Manager " + this.getPersonName() + " with " 
            + this.getEmployeeID() + " ID " + " from " + 
            this.getDepartmentID() + " department has " + 
            Double.toString(this.getSalary()) + 
            " salary, lives on " + this.getAddress());
    }
}