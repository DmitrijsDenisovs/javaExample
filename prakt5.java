import JavaPackages.Manager;
import java.util.ArrayList;
public class prakt5{
    
    public static void main(String[] args){
        
        ArrayList<Manager> managerList = new ArrayList<Manager>();
        
        for(int i = 1; i <= 4; i++){
            System.out.print("Type in " + Integer.toString(i) + 
                " manager's name: ");
            String inputName = System.console().readLine();

            System.out.print("Type in " + Integer.toString(i) + 
                " manager's address: ");
            String inputAddress = System.console().readLine();

            boolean isDouble = false;
            double resultSalary = 1.0D;
            do{
                System.out.print("Type in " + Integer.toString(i) + 
                    " manager's salary: ");
                String inputSalary = System.console().readLine();
                try{
                    resultSalary = Double.parseDouble(inputSalary);
                    isDouble = true;
                }
                catch(Exception e){
                    isDouble = false;
                }
            }while(isDouble == false);

            boolean isInteger = false;
            int resultDepartmentID = 1;
            do{
                System.out.print("Type in " + Integer.toString(i) + 
                    " manager's department ID: ");
                String inputDepartmentID = System.console().readLine();
                try{
                    resultDepartmentID = Integer.parseInt(inputDepartmentID);
                    isInteger = true;
                }
                catch(Exception e){
                    isInteger = false;
                }
            }while(isInteger == false);

            managerList.add(new Manager(inputName, inputAddress, 
                resultSalary, resultDepartmentID));
        }
        int newDepartmentID = 15;
        boolean isInteger = false;
        do{
            System.out.print("Type in " + Integer.toString(5) + 
                " manager's department ID: ");
            String inputDepartmentID = System.console().readLine();
            try{
                newDepartmentID = Integer.parseInt(inputDepartmentID);
                isInteger = true;
            }
            catch(Exception e){
                isInteger = false;
            }
        }while(isInteger == false);

        Manager managerToCopy = new Manager(managerList.get(3));
        managerToCopy.setDepartmentID(newDepartmentID);
        managerList.add(managerToCopy);
        for(JavaPackages.Manager manager : managerList)
           manager.showPersonDetails();
    }
}