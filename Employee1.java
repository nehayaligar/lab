package lab;

class Employee1 {
   
    private int id;
    private String name;
    private double salary;
    private String location;
    private String Department;

    public Employee1(int id, String name, double salary,String loction,String Department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location=loction;
        this.Department=Department;

    }
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Location: " + location);
        System.out.println("Employee Department: " + Department);
    }
    public static void main(String[] args) {
        Employee1 employee = new Employee1(101, "Alaina", 50000.00,"Hubli","Computer Science");
        employee.displayDetails();
    }
}
