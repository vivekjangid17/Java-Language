class Employee
{
    int empid;
    String name;
    static String company = "KN";

    Employee(int empid, String name)
    {
        this.empid = empid;
        this.name = name;
        this.company = company;
    }

    void display()
    {
        System.out.println(empid+" "+name+" "+company);
    }

}

public class static_var
{
    public static void main(String args[])
    {
        Employee e1 = new Employee(101,"Vivek");
        e1.display();
        Employee e2 = new Employee(102,"Nisha");
        e1.display();
        Employee e3 = new Employee(103,"Veeru");
        e1.display();
    }
}