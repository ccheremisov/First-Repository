package Module2.HomeWork3;

public class Start {
    public static void main(String[] args) {

        EmployeeHourlySalary employeeHourlySalary = new EmployeeHourlySalary();
        EmployeeFixSalary employeeFixSalary = new EmployeeFixSalary();

        employeeFixSalary.salary();
        employeeHourlySalary.salary();
    }
}
