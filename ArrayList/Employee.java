import java.util.*;
public class Employee{
    
    private int id;
    private String name;
    private String department = "Sales";
    private int age;

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Employee(int id, String name, int age, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
    void Display(){
        System.out.println(id+" "+name+" "+department+" "+age);
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(01, "Mustafa", 23);
        Employee emp2 = new Employee(2, "Taha", 25, "IT");
        HashMap<Integer, Employee> eMap = new HashMap<Integer, Employee>();
       
        eMap.put(02, emp);
        eMap.put(25, emp2);
        
        System.out.println(eMap.containsKey(2));
        // emp.Display();
        // emp2.Display();
        
    }

}