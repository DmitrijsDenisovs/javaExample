package JavaPackages;
public class Person {
    private String personName;
    private String address;

    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getPersonName(){
        if(this.personName != null)
            return this.personName;
        else
            return null;
    }
    public String getAddress(){
        if(this.address != null)
            return this.address;
        else
            return null;
    }

    public Person(String personName, String address){
        this.setPersonName(personName);
        this.setAddress(address);
    } 

    public void showPersonalDetails(){
        System.out.println(this.getPersonName() + 
            " lives on " + this.getAddress());
    }
}
