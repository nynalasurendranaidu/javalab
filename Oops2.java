class Employee {
    
    int    empId;
    String name;
    double salary;

    
    Employee(int id, String n, double sal) {
        empId  = id;
        name   = n;
        salary = sal;
    }

    
    void display() {
        System.out.printf("ID: %d | Name: %s | Salary: %.2f%n", empId, name, salary);
    }

    
    static void companyName() {
        System.out.println("ANITS Engineering College");
    }
}
class Oops2{
	public static void main(String[] args){
		Employee e1=new Employee(37, "Surendra" ,1000);
		Employee e2=new Employee(20, "Chandhu" ,2000);
		e1.display();
		e2.display();
	}
}