class Employee
{
    void Display()
    {
        System.out.println("Employee");
    }
    void calcSalary()
    {
        System.out.println("Salary of the Employee is 10000");
    }
}

class Engineer extends Employee
{
    void calcSalary()
    {
        System.out.println("Salary of the employee is 20000");
    }
    void Functions()
    {
        Display();
        super.calcSalary();
        calcSalary();
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        Engineer x=new Engineer();
        x.Functions();
    }
}