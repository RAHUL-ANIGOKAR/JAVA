class Details{
    String Name;
    double Salary;

    void info(){
        System.out.println("Name of the Employee is :"+Name);
    }
}

class Manager extends Details{
    void report(){
        System.out.println(Name+" "+"is Managing the Team");
    }
}

class Developer extends Details{
    void dev(){
        System.out.println(Name+" "+"is coding");
        System.out.println("Salary of Developer :"+Salary);
    }
}

public class Employee {
    public static void main(String[] args){
        Manager m = new Manager();
        m.Name = "RAHUL";
        m.info();
        m.report();

        Developer d = new Developer();
        d.Name = "AMIT";
        d.Salary = 20148.00;
        d.dev();

    }
}
