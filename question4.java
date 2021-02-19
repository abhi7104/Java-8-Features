interface emp{
    Employee getdetails(String name,Integer age,String city);
}
class Employee{
    String name,city;
    Integer age;

    Employee(String name,Integer age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
        System.out.println("Name: "+name+" Age: "+age+" City: "+city);
    }

}
public class question4 {
    public static void main(String[] args) {
        emp e=Employee::new;//Constructor reference
        e.getdetails("Abhishek",23,"uttar pardesh");
        e.getdetails("justin",24,"kerala");
    }
}
