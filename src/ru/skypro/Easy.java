package ru.skypro;

class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        addEmployee(new Employee("Иван", "Иванов", "Иванович", 1, 100_000f));
        addEmployee(new Employee("Иван1", "Иванов1", "Иванович", 1, 200_000f));
        addEmployee(new Employee("Иван2", "Иванов2", "Иванович", 1, 300_000f));
        addEmployee(new Employee("Иван3", "Иванов3", "Иванович", 1, 500_000f));
        addEmployee(new Employee("Иван4", "Иванов4", "Иванович", 1, 800_000f));


        printEmployees();
        System.out.println("Суммарная трата на ЗП сотрудников: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        printFullNames();
    }

    public static void printEmployees() {
        for (Employee employee: employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static float calculateTotalSalary() {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(){
        Employee result = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary(){
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary(){
        int employeeCount = 0;
        for(Employee employee: employees){
            if(employee != null){
                employeeCount++;
            }
        }
        return calculateTotalSalary()/employeeCount;
    }

    public static void printFullNames(){
        for (Employee employee : employees){
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static boolean addEmployee(Employee newEmployee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees [i] = newEmployee;
                return true;
            }
        }
        return false;
    }
}
