import java.util.Arrays;
import java.util.Date;

public class ARQuestion2 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[3];
        empArray[0] = new Employee("Robert", "1994", 20000l, "64C- Walls Street");
        empArray[1] = new Employee("Sam", "2000", 235236l, "68DC- Walls Street");
        empArray[2] = new Employee("John", "1999", 2364732l, "26B- Walls Street");
        System.out.println("The Employee details are as follows : ");
        System.out.println("*********************************************************************************************");
        System.out.format("%-10s %10s %9s %13s", "EmployeeName", "YearOfJoining", "Salary", "Address\n");
        System.out.println("---------------------------------------------------------------------------------------------");
        Arrays.stream(empArray).forEach(emp -> System.out.format("%-14s %-14s %-11d %8s", emp.getName(), emp.getYearOfJoining(), emp.getSalary(), emp.getAddress() + "\n"));
    }
}

class Employee {
    private String name;
    private String yearOfJoining;
    private long salary;
    private String address;

    public Employee() {
    }

    public Employee(String name, String yearOfJoining, long salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(String yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

}
