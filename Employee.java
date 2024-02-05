public class Employee {
    //salary is a private variable
    private int salary;
    //name is a private variable
    private String name;
    
    // accessor method to access the private variable salary
    public int getSalary(){
        return salary;
    }

    // accessor method to access the private variable name
    public String getName() {
        return name;
    }

    // mutator method to change the value of the private variable name
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
