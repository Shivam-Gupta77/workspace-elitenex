package test;

public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    static String companyName;
    private String projectName;
    private String department;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 1;
        emp.empName = "shivam";
        emp.empSalary = 1000.00;
        emp.companyName = "Samsung";
        emp.projectName = "full stack";
        emp.department = "IT";

        Employee emp2 = new Employee();
        emp2.empId = 2;
        emp2.empName = "Brijesh";
        emp2.empSalary = 2000;
        emp2.companyName = "apple";
        emp2.projectName = "seo";
        emp2.department = "Marketing";

        System.out.println(emp.empName + " " + emp.companyName);
        System.out.println(emp2.department + " " + Employee.companyName);

    }

}
