import java.util.*;
class Employee {
    int id;
    String name;
    double salary;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class PS005 {
    private Map<Integer, Employee> employeeMap;

    public PS005() {
        this.employeeMap = new HashMap<>();
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null || employeeMap.containsKey(emp.getId())) {
            return emp == null ? 1 : 2;
        }
        employeeMap.put(emp.getId(), emp);
        return 0;
    }

    public int removeEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            return 2;
        }
        employeeMap.remove(employeeId);
        return 0;
    }

    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null);
    }

    public List<Employee> getEmployeeList() {
        return employeeMap.isEmpty() ? null : new ArrayList<>(employeeMap.values());
    }

    public static void main(String[] args) {
        PS005 collectionMap = new PS005();
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee emp3 = new Employee(3, "Alice Brown", 55000);

        System.out.println(collectionMap.addEmployee(emp1));
        System.out.println(collectionMap.addEmployee(emp2));
        System.out.println(collectionMap.addEmployee(emp3));
        System.out.println(collectionMap.addEmployee(emp1));

        System.out.println(collectionMap.findEmployee(1));
        System.out.println(collectionMap.findEmployee(4));

        System.out.println(collectionMap.removeEmployee(2));
        System.out.println(collectionMap.removeEmployee(4));

        List<Employee> employees = collectionMap.getEmployeeList();
        if (employees != null) {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No employees found.");
        }
    }
}